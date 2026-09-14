package com.app.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Enrollment {

        private Integer enrollmentId;
        private Integer studentId;
        private Integer subjectId;
        private Integer termId;
        private LocalDate enrollmentDate;
        private EnrollmentStatus status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Integer getEnrollmentId() {
            return enrollmentId;
        }

        public void setEnrollmentId(Integer enrollmentId) {
            this.enrollmentId = enrollmentId;
        }

        public Integer getStudentId() {
            return studentId;
        }

        public void setStudentId(Integer studentId) {
            this.studentId = studentId;
        }

        public Integer getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(Integer subjectId) {
            this.subjectId = subjectId;
        }

        public Integer getTermId() {
            return termId;
        }

        public void setTermId(Integer termId) {
            this.termId = termId;
        }

        public LocalDate getEnrollmentDate() {
            return enrollmentDate;
        }

        public void setEnrollmentDate(LocalDate enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
        }

        public EnrollmentStatus getStatus() {
            return status;
        }

        public void setStatus(EnrollmentStatus status) {
            this.status = status;
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
