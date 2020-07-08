package com.captainamericamodule92.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Difficulty {

    @Id
    @GeneratedValue
    private Long id;
    private String level;
    @OneToMany(mappedBy = "difficulty")  //changed this from difficutly to difficulty
    private Collection<Cave> caves;

    public Long getId() {
        return id;
    }

//    public String getDifficultyLevel() { return level;}

    public String getLevel() {
        return level;
    }

    public Collection<Cave> getCaves() {
        return caves;
    }

    public Difficulty() {}

//    public Difficulty(String difficultyLevel) {
//        this.level = difficultyLevel;
//    }

    public Difficulty(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Difficulty level = (Difficulty) o;
        return Objects.equals(id, level.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
