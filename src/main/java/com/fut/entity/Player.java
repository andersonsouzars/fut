package com.fut.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String team;

    // Construtores
    public Player() {}

    public Player(String name, String position, Integer age, String team) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.team = team;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }
}
