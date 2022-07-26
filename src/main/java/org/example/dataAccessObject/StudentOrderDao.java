package org.example.dataAccessObject;

import org.example.exeption.DaoException;
import org.example.infoAboutPerson.StudentOrder;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
