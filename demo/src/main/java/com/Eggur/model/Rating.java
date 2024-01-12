package com.Eggur.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "rating")
@Data
@RequiredArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = false)
    private Long id;

    @Column(name = "price_rating")
    private Double priceRating;

    @Column(name = "delivery_rating")
    private Double deliveryRating;

    @Column(name = "reliability_rating")
    private Double reliabilityRating;

    @OneToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productId;
}
