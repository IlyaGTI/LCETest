package com.example.lcetest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class JournalEntry {

    @Id
    private UUID uuid;

    private LocalDate begda;
    private LocalDate ennda;
    private String field1;
    private String field2;
}