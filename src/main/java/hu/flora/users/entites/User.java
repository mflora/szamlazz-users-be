package hu.flora.users.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import hu.flora.users.types.JobType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 64, nullable = false)
    @NotNull(message = "error.user.firstname.null")
    @NotBlank(message = "error.user.firstname.blank")
    @Size(min = 2, max = 64)
    private String firstName;

    @Column(name = "last_name", length = 64, nullable = false)
    @NotNull(message = "error.user.lastname.null")
    @NotBlank(message = "error.user.lastname.blank")
    @Size(min = 2, max = 64)
    private String lastName;

    @Column(name = "address", length = 128)
    @Size(max = 128)
    private String address;

    @Column(name = "telephone", length = 128)
    @Size(max = 128)
    private String telephone;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "job")
    @Enumerated(EnumType.STRING)
    private JobType job;
}
