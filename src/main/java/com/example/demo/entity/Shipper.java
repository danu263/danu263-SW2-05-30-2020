package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "shippers")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShipperID")
    private int id;
    @Column(name = "CompanyName",nullable = false)
    private String companyName;
    @Column(name = "Phone")
    private String phone;
}
