package com.tpk.ThymeleafSpringBoot.dao;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UsersDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userID;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

}
