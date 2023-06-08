package com.example.java_web_final_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity( name = "Candies")
public class Candy {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String flavor;
    private String texture;

    public Candy() {

    }

    public Candy( String name, String flavor, String texture) {
        this.name = name;
        this.flavor = flavor;
        this.texture = texture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candy candy)) return false;
        return getId() == candy.getId() && Objects.equals(getName(), candy.getName()) && Objects.equals(getFlavor(), candy.getFlavor()) && Objects.equals(getTexture(), candy.getTexture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getFlavor(), getTexture());
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}
