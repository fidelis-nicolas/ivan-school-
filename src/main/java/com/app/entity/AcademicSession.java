package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AcademicSession {
    private int sessionId;
    private String  sessionName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public AcademicSession(int sessionId, String sessionName, LocalDate startDate,
                           LocalDate endDate, Boolean isCurrent,
                           LocalDateTime createdAt, LocalDateTime updateAt) {
        this.sessionId = sessionId;
        this.sessionName = sessionName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isCurrent = isCurrent;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public AcademicSession() {
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getCurrent() {
        return isCurrent;
    }

    public void setCurrent(Boolean current) {
        isCurrent = current;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
