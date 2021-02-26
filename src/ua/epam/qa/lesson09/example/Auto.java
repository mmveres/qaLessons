package ua.epam.qa.lesson09.example;

public  abstract class Auto implements Comparable {
    private int id;
    private static int globalID = 1;

    public Auto() {
        this.id = globalID++;
    }

    public int getId() {
        return id;
    }



}
