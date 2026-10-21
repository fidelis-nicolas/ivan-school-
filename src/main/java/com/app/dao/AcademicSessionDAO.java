package com.app.dao;

import com.app.entity.AcademicSession;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcademicSessionDAO {
    public void createAcademicSession(AcademicSession session) {
        String sql = "insert into academicsession values(null,?,?,?,?,now(),null)";
        try {
            Connection connect = DBConnect.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, session.getSessionName());
            preparedStatement.setDate(2, Date.valueOf(session.getStartDate()));
            preparedStatement.setDate(3, Date.valueOf(session.getEndDate()));
            preparedStatement.setInt(4, session.getCurrent() ? 1 : 0);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public AcademicSession getById(int id) {
        String sql = "select * from academicsession where session_id = ?";
        AcademicSession academicSession = new AcademicSession();
        try {
            Connection connect = DBConnect.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

//            while (resultSet.next()) {
//                academicSession.setSessionId(resultSet.getInt("session_id"));
//                academicSession.setSessionName(resultSet.getString("session_name"));
//                academicSession.setStartDate(resultSet.getDate("start_date").toLocalDate());
//                academicSession.setEndDate(resultSet.getDate("end_date").toLocalDate());
//                academicSession.setCurrent(resultSet.getBoolean("is_current"));
//                academicSession.setStartDate(LocalDate.from(resultSet.getTimestamp("created_at").toLocalDateTime()));
//                academicSession.setStartDate(LocalDate.from(resultSet.getTimestamp("updated_at").toLocalDateTime()));

//            }
            if (resultSet.next()) {
                return mapRow(resultSet);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

        //TODO delete,update,getById, getAll
    }

    public void deleteSession(int id) {
        String sql = "delete from academicsession where session_id = ?";
        try {
            Connection connect = DBConnect.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateAcademicSession(AcademicSession academicSession) {
        String sql = "update academicsession set session_name= ?, start_date= ?," +
                " end_date=?, is_current=?, updated_at=now() where session_id=?";
        try {
            Connection connect = DBConnect.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<AcademicSession> getAll() {
        String sql = "select * from academicsession";
        ArrayList <AcademicSession> academicSessionsList = new ArrayList<AcademicSession>();
        try {
            Connection connect = DBConnect.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                academicSessionsList.add(mapRow(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return academicSessionsList;
    }

    private AcademicSession mapRow(ResultSet resultSet) throws SQLException {
        AcademicSession academicSession = new AcademicSession();
        academicSession.setSessionId(resultSet.getInt("session_id"));
        academicSession.setSessionName(resultSet.getString("session_name"));
        academicSession.setStartDate(resultSet.getDate("start_date").toLocalDate());
        academicSession.setEndDate(resultSet.getDate("end_date").toLocalDate());
        academicSession.setCurrent(resultSet.getBoolean("is_current"));

        if (resultSet.getTimestamp("created_at") != null) {
            academicSession.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
        }
        if (resultSet.getTimestamp("updated_at") != null) {
            academicSession.setUpdateAt(resultSet.getTimestamp("updated_at").toLocalDateTime());
        }
        return academicSession;
    }
}

