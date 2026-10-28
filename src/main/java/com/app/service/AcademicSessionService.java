package com.app.service;

import com.app.entity.AcademicSession;

import java.util.List;

public interface AcademicSessionService {
    public void delete(int id);
    public void update(AcademicSession academicSession);
    public void create(AcademicSession academicSession);
    public List<AcademicSession> getAll ();
    public AcademicSession getByID(int id);

}
