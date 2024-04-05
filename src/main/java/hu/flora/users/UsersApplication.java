package hu.flora.users;

import hu.flora.users.entites.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@SpringBootApplication
public class UsersApplication {

	@Bean
	public RepositoryRestConfigurer corsConfigurer() {
		return new RepositoryRestConfigurer() {

			@Override
			public void configureRepositoryRestConfiguration(
					RepositoryRestConfiguration config,
					CorsRegistry cors) {
				cors.addMapping("/**").allowedOrigins("*");

				config.setDefaultMediaType(MediaType.APPLICATION_JSON);
				config.useHalAsDefaultJsonMediaType(false);
				config.exposeIdsFor(User.class);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

}
