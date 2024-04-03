package hu.flora.users.repositories;

import hu.flora.users.entites.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long> {
}
