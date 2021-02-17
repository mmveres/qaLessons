package ua.epam.qa.lesson07;

import ua.epam.qa.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList implements Iterable<Student>{
    private List<Student> studList;

    public StudentList(List<Student> studList) {
        this.studList = studList;
    }

    @Override
    public Iterator<Student> iterator() {
        return studList.iterator();
    }
}
