package com.javaLearning.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 250)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 250)
    private String lastName;

    @Column(name = "mail", nullable = false, unique = true, length = 250)
    private String mail;

    @Column(name = "password", nullable = false, length = 250)
    private String password;

    /**
     * Constructeur par défaut requis par JPA.
     */
    public Employee() {
    }
}
