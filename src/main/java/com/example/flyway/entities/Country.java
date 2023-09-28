package com.example.flyway.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
