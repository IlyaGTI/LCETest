package com.example.lcetest.repository;

import com.example.lcetest.model.JournalEntry;
import com.example.lcetest.model.dto.JournalEntryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntry, UUID> {

    @Query(value = "SELECT j.uuid, j.begda, j.ennda, a.field3, a.field4, e.field5, e.field6 " +
            "FROM journal_entry j " +
            "LEFT JOIN additional_field_entry a ON j.uuid = a.uuid " +
            "LEFT JOIN extra_field_entry e ON j.uuid = e.uuid " +
            "WHERE j.uuid = :uuid AND j.begda >= :startDate AND j.ennda <= :endDate",
            nativeQuery = true)
    List<JournalEntryDTO> getJournalData(@Param("uuid") String uuid,
                                         @Param("startDate") LocalDate startDate,
                                         @Param("endDate") LocalDate endDate);
}