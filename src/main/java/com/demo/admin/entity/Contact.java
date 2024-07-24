package com.demo.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;


@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(name = "contactid")
    private int contactid;
    @Column(name = "phonenum")
    private String phonenum;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
}
