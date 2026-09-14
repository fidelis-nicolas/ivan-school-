package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Term {

    private Integer termId;
    private Integer sessionId;
    private TermName termName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Term() {
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public TermName getTermName() {
        return termName;
    }

    public void setTermName(TermName termName) {
