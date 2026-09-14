package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

    private Integer studentId;
    private Integer userId;
    private String admissionNumber;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate enrollmentDate;
    private Integer classId;
    private String email;
    private String phone;
    private String address;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = user