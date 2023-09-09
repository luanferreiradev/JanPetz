package com.example.janpet.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String breed;
    private String adoptionRequirements;

    // Outros atributos e métodos podem ser adicionados conforme necessário

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAdoptionRequirements() {
        return adoptionRequirements;
    }

    public void setAdoptionRequirements(String adoptionRequirements) {
        this.adoptionRequirements = adoptionRequirements;
    }

    // Outros getters e setters para atributos adicionais
}
