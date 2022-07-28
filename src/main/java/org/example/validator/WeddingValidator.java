package org.example.validator;

import org.example.infoAboutPerson.StudentOrder;
import org.example.infoAboutPerson.wedding.AnswerWedding;

public class WeddingValidator
{
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}
