package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther DRevelation
 * @Date 2019-06-10 15:48
 * @Desc
 */
@Table(name = "user")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}