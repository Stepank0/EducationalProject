package org.example.validator.register;

import org.example.exeption.CityRegisterException;
import org.example.exeption.TransportException;
import org.example.infoAboutPerson.Person;
import org.example.infoAboutPerson.register.CityRegisterResponse;

public interface CityRegisterChecker
{
    CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException;
}
