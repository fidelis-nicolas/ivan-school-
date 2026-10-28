package com.app.service;

import com.app.dao.AcademicSessionDAO;
import com.app.entity.AcademicSession;

import java.util.List;

public class AcademicSessionServiceImpl implements AcademicSessionService{

    private AcademicSessionDAO academicSessionDAO;

    public AcademicSessionServiceImpl(AcademicSessionDAO academicSessionDAO) {
        this.academicSessionDAO = academicSessionDAO;
    }

    @Override
    public void delete(int id) {
        if(getByID(id)==null){
            throw new IllegalArgumentException("Academic session with id =" +id +" does not exist.");
        }
        academicSessionDAO.deleteSession(id);

    }

    @Override
    public void update(AcademicSession academicSession) {

    }

    @Override
    public void create(AcademicSession academicSession) {

    }

    @Override
    public List<AcademicSession> getAll() {
        return List.of();
    }

    @Override
    public AcademicSession getByID(int id) {
        return academicSessionDAO.getById(id);
    }

}
