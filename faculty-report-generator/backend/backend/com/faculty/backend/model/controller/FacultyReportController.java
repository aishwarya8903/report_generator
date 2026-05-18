package com.faculty.backend.controller;

import com.faculty.backend.model.FacultyReport;
import com.faculty.backend.repository.FacultyReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
@CrossOrigin("*")
public class FacultyReportController {

    @Autowired
    private FacultyReportRepository repository;

    @PostMapping
    public FacultyReport addReport(@RequestBody FacultyReport report) {
        return repository.save(report);
    }

    @GetMapping
    public List<FacultyReport> getReports() {
        return repository.findAll();
    }
}