package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "EmployeeID")
    private int id;
    @Column(name = "LastName",nullable = false)
    private String lastName;
    @Column(name = "FirstName",nullable = false)
    private String firstName;
    @Column(name = "Title")
    private String title;
    @Column(name = "TitleOfCourtesy")
    private String titleOfCourtesy;
    @Column(name = "BirthDate")
    private LocalDateTime birthDate;
    @Column(name = "HireDate")
    private LocalDateTime hireDate;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "Country")
    private String country;
    @Column(name = "HomePhone")
    private String homePhone;
    @Column(name = "Extension")
    private String extension;
    @Lob
    @Column(name = "Photo")
    private byte[] photo;
    @Column(name = "Notes",nullable = false)
    private String notes;
    @ManyToOne
    @JoinColumn(name = "ReportsTo")
    private Employee manager;
    @Column(name = "PhotoPath")
    private String photoPath;
    @Column(name = "Salary")
    private float salary;
}
