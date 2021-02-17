package ua.epam.qa.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable, Comparable<Student> {
    protected static String faculty;
    private int id;
    private transient String password;
    private String name;
    private Address address;
    private int []marks;
    private static final long serialVersionUID = 2L;
    public Student() {
    }

    public Student(int id, String name, String password, Address address, int[] marks) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}
