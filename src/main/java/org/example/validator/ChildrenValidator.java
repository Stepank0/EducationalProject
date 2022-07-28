package org.example.validator;

import org.example.infoAboutPerson.StudentOrder;
import org.example.infoAboutPerson.children.AnswerChildren;

public class ChildrenValidator
{
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
