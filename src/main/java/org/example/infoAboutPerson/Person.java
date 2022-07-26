package org.example.infoAboutPerson;

import java.time.LocalDate;

public abstract class Person {
    private String surName;
    private String giveName;
    private String patronymic;
    private LocalDate dataOfBirth;
    private Address address;

    public Person(){
    }

    public Person(String surName, String giveName, String patronymic, LocalDate dataOfBirth) {
        this.surName = surName;
        this.giveName = giveName;
        this.patronymic = patronymic;
        this.dataOfBirth = dataOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
