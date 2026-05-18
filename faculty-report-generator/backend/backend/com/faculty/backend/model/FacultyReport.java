package com.faculty.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FacultyReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facultyName;
    private String department;
    private String month;
    private int classesHandled;
    private int hoursWorked;
    private String activities;
}