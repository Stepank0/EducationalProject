package org.example.DataAccessObject;

import org.example.Exeption.DaoException;
import org.example.InfoAboutPerson.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImpl implements DictionaryDao
{
    private static final String GET_STREET = "select street_code, street_name" +
            " from street where UPPER(street_name) like UPPER(?)";

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "21791");
        return con;
    }

    public List<Street> findStreet(String pattern) throws DaoException
    {
        List<Street> result = new LinkedList<>();

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_STREET))
        {
            stmt.setString(1, pattern);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
                result.add(str);
            }
        } catch (SQLException ex){
            throw new DaoException(ex);
        }
        return result;
    }
}
