package com.app.service;

import com.app.entity.Term;

import java.util.List;

public interface TermService {
    public void delete(int id);
    public void update(Term term);
    public void create(Term term);
    public List<Term> getAll ();
    public Term getTermByID(int id);
}
