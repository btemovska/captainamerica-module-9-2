package com.captainamericamodule92.demo.models;

import javax.persistence.*;
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

    public Cave(String name, String imageUrl, Location location, Difficulty difficulty){
        this.name = name;
        this.imageUrl = imageUrl;
        this.location = location;
        this.difficulty = difficulty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave director = (Cave) o;
        return Objects.equals(id, director.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


