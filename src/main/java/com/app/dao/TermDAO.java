package com.app.dao;

import com.app.entity.Term;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TermDAO {
    public void createTerm(Term term) {
        String sql = "insert into Term values(null,?,?,?,?,?,now(),?)";
        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setInt(1,term.getSessionId());
            preparedStatement.setString(2, String.valueOf(term.getTermName()));
            preparedStatement.setDate(3, Date.valueOf(term.getStartDate()));
            preparedStatement.setDate(4,Date.valueOf(term.getEndDate()));
            preparedStatement.setInt(5, term.getCurrent() ? 1 : 0);
            preparedStatement.execute();

        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
