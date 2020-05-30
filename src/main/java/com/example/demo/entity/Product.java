package com.example.demo.entity;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int id;
    @Column(name = "ProductName",nullable = false)
    private String productName;
    @ManyToOne
    @JoinColumn( name = "SupplierID")
    private Supplier supplierID;
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category categoryID;
    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Column(name = "UnitsInStock")
    private int unitsInStock;
    @Column(name = "UnitsOnOrder")
    private int unitsOnOrder;
    @Column(name = "ReorderLevel")
    private int reorderLevel;
    @Column(name = "Discontinued",nullable = false)
    private boolean discontinued;
}
