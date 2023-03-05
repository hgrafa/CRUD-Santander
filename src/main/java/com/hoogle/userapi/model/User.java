package com.hoogle.userapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    // Repository<User, Long>
    // findAll, findById, save, delete, deleteById
    // primary key = identificador único para cada entidade
    // boiler plate = código repetitivo e sem muito sentido prático
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean active;
}
