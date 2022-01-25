package com.mekveto.vetoapp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "name", nullable= false, length=100)
    private String name;

    @Column(name= "surname", nullable= false, length=100)
    private String surName;

    @Column(name= "username", unique = true , nullable= false, length=100)
    private String username;

    @Column(name= "password", nullable= false, length=100)
    private String password;

    @Column(name= "phone", unique = true , nullable= false, length=100)
    private String phone;

    @Column(name= "e_mail", unique = true , nullable= false, length=100)
    private String eMail;

    @Enumerated(EnumType.STRING)
    @Column(name= "role", nullable= false, length=100)
    private Role role;

    @Column(name= "create_time", nullable= false)
    private LocalDateTime createTime;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Animal> animalList = new ArrayList<>();

    @Transient
    private String token;
}
