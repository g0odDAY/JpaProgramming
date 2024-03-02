package com.example.jpapractice.model;

import jakarta.persistence.*;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = "ID_GENERATOR")
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID",nullable = false)
    private Item item;


}
