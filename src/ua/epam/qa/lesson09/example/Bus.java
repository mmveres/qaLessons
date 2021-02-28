package ua.epam.qa.lesson09.example;

public class Bus extends Auto {
    private String name;


    public Bus( String name, int route) {
        super(route);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", route=" + getRoute() +
                '}';
    }

}
