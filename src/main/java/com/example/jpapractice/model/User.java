package com.example.jpapractice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    @NotNull
    private String username;

    @OneToMany(mappedBy = "user")
    protected Set<BillingDetails> billingDetails = new HashSet<>();

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<BillingDetails> getDefaultBilling() {
        return Collections.unmodifiableSet(billingDetails);
    }

    public void addBillingDetail(BillingDetails defaultBilling) {
        billingDetails.add(defaultBilling);
    }
}
