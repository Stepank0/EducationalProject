package org.example.DataAccessObject;

import org.example.Exeption.DaoException;
import org.example.InfoAboutPerson.PassportOffice;
import org.example.InfoAboutPerson.RegisterOffice;
import org.example.InfoAboutPerson.Street;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreet(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffice(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffice(String areaId) throws DaoException;
}
