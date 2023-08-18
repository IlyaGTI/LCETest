package com.example.lcetest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class ExtraFieldEntry {

    @Id
    private UUID uuid;

    private String field5;
    private String field6;

}
