package com.captainamericamodule92.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @OneToMany(mappedBy = "location")
    private Collection<Cave> caves;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Collection<Cave> getCaves() {
        return caves;
    }

    public Location() {
    }

    public Location(String name, String imageUrl, Cave... caves) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.caves = new ArrayList<>(Arrays.asList(caves));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        Location location = (Location) o;
        Location name = (Location) o;
//        return Objects.equals(id, location.id);
        return Objects.equals(id, name.id);
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}