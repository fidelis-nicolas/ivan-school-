package com.app.dao;

import com.app.entity.Term;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TermDAO {
    public void createTerm(Term term) {
        String sql = "insert into Term values(null,?,?,?,?,?,now(),?)";
        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setInt(1, term.getSessionId());
            preparedStatement.setString(2, String.valueOf(term.getTermName()));
            preparedStatement.setDate(3, Date.valueOf(term.getStartDate()));
            preparedStatement.setDate(4, Date.valueOf(term.getEndDate()));
            preparedStatement.setInt(5, term.getCurrent() ? 1 : 0);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Term getTermByID(int id) {
        String sql = "SELECT * FROM TERM WHERE term_id = ?";
        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return mapRow(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Term> getAllTerm() {
        String sql = "SELECT * FROM TERM";
        List<Term> terms = new ArrayList<>();
        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                terms.add(mapRow(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terms;
    }

    public void delete(int id) {
        String sql = "DELETE FROM TERM WHERE id =?";
        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Term term) {
        String sql = "UPDATE TERM SET term_name=?,session_id=?, start_date = ?, end_date=?, is_current=?, update_at = now() WHERE term_id=?";

        try (Connection connect = DBConnect.connect();
             PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setString(1, term.getTermName().name());
            preparedStatement.setInt(2, term.getSessionId());
            preparedStatement.setDate(3, Date.valueOf(term.getStartDate()));
            preparedStatement.setDate(4, Date.valueOf(term.getEndDate()));
            preparedStatement.setBoolean(5, term.getCurrent());
            preparedStatement.setInt(6, term.getTermId());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
}


private Term mapRow(ResultSet resultSet) throws SQLException {
    Term term = new Term();
    term.setTermId(resultSet.getInt("term_id"));
    term.setSessionId(resultSet.getInt("session_id"));
    term.setTermName(Term.TermName.valueOf(resultSet.getString("term_name")));
    term.setStartDate(resultSet.getDate("start_date").toLocalDate());
    term.setEndDate(resultSet.getDate("end_date").toLocalDate());
    term.setCurrent(resultSet.getBoolean("is_current"));
    term.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
    term.setUpdatedAt(resultSet.getTimestamp("updated_at").toLocalDateTime());
    return term;
}

}
