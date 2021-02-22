package ua.epam.qa.lesson08;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Ship{
    private String name;
    private String port;
    private int id;

    public Ship(String name, String port, int id) {
        this.name = name;
        this.port = port;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", port='" + port + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return id == ship.id && name.equals(ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
public class ProgramHash {
    public static void main(String[] args) {
        Map<Ship, Integer> shipMap = new HashMap<>();
        Ship ship1 = new Ship("Ship","Odessa", 111);
        Ship ship2 = new Ship("Ship","Mikolayv", 111);
        shipMap.put(ship1, 222);

        System.out.println(ship1.hashCode());
        System.out.println(ship2.hashCode());

        System.out.println(shipMap.containsKey(ship2));
        System.out.println(shipMap.get(ship2));

    }
}
