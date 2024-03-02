package com.example.jpapractice.model;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;
    private String name;

    @ElementCollection
    @CollectionTable(name = "IMAGE")
    @AttributeOverride(
            name = "filename",
            column = @Column(name = "FNAME",nullable = false)
    )
    private Set<Image> images = new HashSet<>();

    public Item() {
    }
    public Long getId(){
        return id;
    }
    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Image> getImages() {
        return Collections.unmodifiableSet(images);
    }

    public void setImages(Image image) {
        images.add(image);
    }
}
