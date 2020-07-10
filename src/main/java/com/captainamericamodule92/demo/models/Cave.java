package com.captainamericamodule92.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
public class Cave {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @ManyToOne
    private Location location;
    private String description;
    @ManyToOne
    private Difficulty difficulty;
    @ManyToMany
    private Collection<Feature> features;
    @ManyToMany
    @JsonIgnore
    private Set<HashTag> hashTags;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Location location() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Collection<HashTag> getHashTags() {
        return hashTags;
    }

    public void addHashTag(HashTag hashTagToAdd) {
        hashTags.add(hashTagToAdd);
    }

    public void deleteHashTag(HashTag hashTagToRemove) {
        hashTags.remove(hashTagToRemove);
    }

    public Cave() {
    }

    ;

    public Cave(String name, String imageUrl, Location location, String description, Difficulty difficulty, Feature... features) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.location = location;
        this.description = description;
        this.difficulty = difficulty;
        this.features = new ArrayList<>(Arrays.asList(features));
        this.hashTags = new HashSet<>();
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


