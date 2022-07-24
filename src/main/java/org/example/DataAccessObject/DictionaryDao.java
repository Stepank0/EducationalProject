package org.example.DataAccessObject;

import org.example.Exeption.DaoException;
import org.example.InfoAboutPerson.Street;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreet(String pattern) throws DaoException;
}
