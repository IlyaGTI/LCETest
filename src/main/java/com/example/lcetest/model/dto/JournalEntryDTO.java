package com.example.lcetest.model.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class JournalEntryDTO {
    private String uuid;
    private LocalDate begda;
    private LocalDate ennda;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;

}