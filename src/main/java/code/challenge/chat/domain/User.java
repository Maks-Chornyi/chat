package code.challenge.chat.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    @NotNull(message = "'username' can not be null")
    private String username;

    @Column(name = "password")
    @NotNull(message = "'password' can not be null")
    private String password;

}
