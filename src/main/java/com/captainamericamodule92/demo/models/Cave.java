package com.captainamericamodule92.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Cave {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @ManyToOne
    private Location location;
    @ManyToOne
    private Difficulty difficulty;
    @ManyToMany
    private Collection<Feature> features;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Location location() { return location;}

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Cave() {};

    public Cave(String name, String imageUrl, Location location, Difficulty difficulty, Feature...features){
        this.name = name;
        this.imageUrl = imageUrl;
        this.location = location;
        this.difficulty = difficulty;
        this.features = new ArrayList<>(Arrays.asList(features));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Objects.equals(id, cave.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


