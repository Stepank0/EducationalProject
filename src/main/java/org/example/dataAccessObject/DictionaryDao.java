package org.example.dataAccessObject;

import org.example.exeption.DaoException;
import org.example.infoAboutPerson.CountryArea;
import org.example.infoAboutPerson.PassportOffice;
import org.example.infoAboutPerson.RegisterOffice;
import org.example.infoAboutPerson.Street;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreet(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffice(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffice(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;

}
