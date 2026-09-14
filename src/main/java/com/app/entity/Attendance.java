package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Attendance {

    private int attendanceId;
    private int studentId;
    private int classId;
    private int termId;
    private LocalDate attendanceDate;
    private AttendanceStatus status;
    private LocalDateTime createdAt;

    public Attendance(int attendanceId, int studentId, int classId, int termId, LocalDate attendanceDate,
                      AttendanceStatus status, LocalDateTime createdAt) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.classId = classId;
        this.termId = termId;
        this.attendanceDate = attendanceDate;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Attendance() {
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
