package org.example.validator.register;

import org.example.exeption.CityRegisterException;
import org.example.exeption.TransportException;
import org.example.infoAboutPerson.Person;
import org.example.infoAboutPerson.register.CityRegisterResponse;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {
        return null;
    }
}
