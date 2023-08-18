package com.example.lcetest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ExtraFieldEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32)
    private String uuid;

    private String field5;

    private String field6;

}
