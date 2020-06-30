package com.captainamericamodule92.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Cave {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String continent;
    @ManyToOne
//    private Difficulty level;
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

    public String continent() { return continent;}

//    public Difficulty getDifficultyLevel() { return level;}

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Cave() {};

//    public Cave(String name, String imageUrl, String continent, Difficulty level) {
//        this.name = name;
//        this. imageUrl = imageUrl;
//        this.continent = continent;
//        this.level = level;
//    }

    public Cave(String name, String imageUrl, String continent, Difficulty difficulty){
        this.name = name;
        this.imageUrl = imageUrl;
        this.continent = continent;
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


