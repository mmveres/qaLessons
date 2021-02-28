package ua.epam.qa.lesson09.example;

public class TroleyBus extends Auto {
    private int route;

    public TroleyBus( int route) {
        super(route);

    }


    @Override
    public String toString() {
        return "TroleyBus{" +
                "id=" + getId() +
                ", route=" + route +
                '}';
    }


}
