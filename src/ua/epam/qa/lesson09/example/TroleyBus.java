package ua.epam.qa.lesson09.example;

public class TroleyBus extends Auto {
    private int route;

    public TroleyBus( int route) {
        super();
        this.route = route;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "TroleyBus{" +
                "id=" + getId() +
                ", route=" + route +
                '}';
    }
}
