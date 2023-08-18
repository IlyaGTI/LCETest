package com.example.lcetest.controller;

import com.example.lcetest.model.dto.JournalEntryDTO;
import com.example.lcetest.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class JournalController {

    @Autowired
    private JournalService journalService;

    @GetMapping("/getJournalData")
    public ResponseEntity<List<JournalEntryDTO>> getJournalData(
            @RequestParam("uuid") String uuid,
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        List<JournalEntryDTO> journalData = journalService.getJournalData(uuid, startDate, endDate);
        return ResponseEntity.ok(journalData);
    }

}