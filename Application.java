package com.learnhub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String internshipDomain;
    private int duration;

    // Constructors
    public Application() {}

    public Application(String name, String email, String internshipDomain, int duration) {
        this.name = name;
        this.email = email;
        this.internshipDomain = internshipDomain;
        this.duration = duration;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInternshipDomain() {
        return internshipDomain;
    }

    public void setInternshipDomain(String internshipDomain) {
        this.internshipDomain = internshipDomain;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
