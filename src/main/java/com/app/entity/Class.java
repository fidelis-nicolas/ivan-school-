package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Class {
    private int classId;
    private String className;
    private String gradeLevel;
    private String section;
    private int teacherId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Class(int classId, String className, String gradeLevel, String section, int teacherId,
                 LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.classId = classId;
        this.className = className;
        this.gradeLevel = gradeLevel;
        this.section = section;
        this.teacherId = teacherId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Class() {
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
