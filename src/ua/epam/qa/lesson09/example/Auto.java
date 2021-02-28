package ua.epam.qa.lesson09.example;

public class Auto implements Comparable<Auto> {
    private int id;
    private int route;
    private static int globalID = 1;

    public Auto() {
        this.id = globalID++;
    }

    public Auto(int route) {
        this();
        this.route = route;
    }

    public int getId() {
        return id;
    }
    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    @Override
    public int compareTo(Auto o) {
        return route - o.getRoute();
    }
}
