package com.captainamericamodule92.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Feature {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "features")
    private Collection<Cave> caves;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Cave> getCaves() {
        return caves;
    }

    public Feature() {
    }

    public Feature(String name, Cave... caves){
        this.name = name;
        this.caves = new ArrayList<>(Arrays.asList(caves));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return Objects.equals(id, feature.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
