package com.example.lcetest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class AdditionalFieldEntry {

    @Id
    private UUID uuid;

    private String field3;
    private String field4;
}