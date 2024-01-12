package com.Eggur.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = false)
    private Long id;

    @Column(name = "label")
    private String label;

    @Column(name = "price")
    private Integer price;

    public Product(long l, String m300, int i) {
    }
}
