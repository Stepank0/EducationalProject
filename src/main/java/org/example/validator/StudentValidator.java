package org.example.validator;

import org.example.infoAboutPerson.StudentOrder;
import org.example.infoAboutPerson.student.AnswerStudent;

public class StudentValidator
{
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
