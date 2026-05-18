package com.faculty.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ReportController {

    private List<Map<String, Object>> reports = new ArrayList<>();

    @GetMapping("/reports")
    public List<Map<String, Object>> getReports() {
        return reports;
    }

    @PostMapping("/reports")
    public Map<String, String> addReport(@RequestBody Map<String, Object> report) {

        reports.add(report);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Report submitted successfully");

        return response;
    }
}