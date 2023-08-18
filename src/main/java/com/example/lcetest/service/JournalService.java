package com.example.lcetest.service;

import com.example.lcetest.model.dto.JournalEntryDTO;


import java.time.LocalDate;
import java.util.List;

public interface JournalService {
    List<JournalEntryDTO> getJournalData(String uuid, LocalDate startDate, LocalDate endDate);
}
