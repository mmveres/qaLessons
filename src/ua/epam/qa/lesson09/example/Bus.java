package ua.epam.qa.lesson09.example;

public class Bus extends Auto {
    private String name;
    private int route;

    public Bus( String name, int route) {
        super();
        this.name = name;
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", route=" + route +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return route - ((Bus)o).getRoute();
    }
}
