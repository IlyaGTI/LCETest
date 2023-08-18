package com.example.lcetest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32)
    private String uuid;

    private LocalDate begda;
    private LocalDate ennda;
    private String field1;
    private String field2;
}