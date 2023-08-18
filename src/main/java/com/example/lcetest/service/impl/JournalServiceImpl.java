package com.example.lcetest.service.impl;

import com.example.lcetest.model.dto.JournalEntryDTO;
import com.example.lcetest.repository.JournalRepository;
import com.example.lcetest.service.JournalService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class JournalServiceImpl implements JournalService {

    @Autowired
    private JournalRepository journalRepository;


    @Override
    public List<JournalEntryDTO> getJournalData(String uuid, LocalDate startDate, LocalDate endDate) {
        return journalRepository.getJournalData(uuid, startDate, endDate);
    }
}