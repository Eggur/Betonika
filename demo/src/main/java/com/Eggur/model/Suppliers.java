package com.Eggur.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "suppliers")
@Data
@RequiredArgsConstructor
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = false)
    private Long id;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "company")
    private String company;

    @Column(name = "phone")
    private Integer phone;

    @OneToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productId;

    @OneToOne
    @JoinColumn(name = "ratingId", referencedColumnName = "id")
    private Rating ratingId;
}
