package org.example.DataAccessObject;

import org.example.InfoAboutPerson.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao {
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "21791");
        return con;
    }

    public List<Street> findStreet(String pattern) throws Exception
    {
        List<Street> result = new LinkedList<>();
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "select street_code, street_name" +
                " from street where UPPER(street_name) like UPPER('%" + pattern + "%')";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Street str = new Street( rs.getLong("street_code"), rs.getString( "street_name"));
            result.add(str);
        }

        return result;
    }
}