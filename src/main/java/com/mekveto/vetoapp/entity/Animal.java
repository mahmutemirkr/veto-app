package com.mekveto.vetoapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "name", nullable = false, length = 100)
    private String name;

    @Column(name= "genus", nullable = false, length = 100)
    private String genus;

    @Column(name= "type", nullable = false, length = 100)
    private String type;

    @Column(name= "age", nullable = false)
    private Integer age;

    @Column(name= "explanation", nullable = false, length = 100)
    private String explanation;

    @Column(name= "create_time", nullable= false)
    private LocalDateTime createTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_number", nullable = false)
    @JsonBackReference
    private User user;



}
