package com.faculty.backend.repository;

import com.faculty.backend.model.FacultyReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyReportRepository extends JpaRepository<FacultyReport, Long> {
}