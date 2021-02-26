package ua.epam.qa.lesson09.example;

public class ProgramAutoPark {
    public static void main(String[] args) {
      //  workParkAndRoute();
        LinkedListNode<Auto> park = new LinkedListNode<>();
        LinkedListNode<Auto> route = new LinkedListNode<>();
        generate3TroleyBus(park);
        generate3TroleyBus(route);
        System.out.println(park.compareTo(route));
        park.print();
        route.print();
    }

    private static void workParkAndRoute() {
        LinkedListNode<Auto> park = new LinkedListNode<>();
        LinkedListNode<Auto> route = new LinkedListNode<>();
        //generate4Bus(park);
        generate3TroleyBus2Bus(park);
        System.out.println("-----------");
        for (Auto item: park) {
            System.out.println(item);
        }
        route.print();
        route.addFirst(park.removeFirst());
        route.addFirst(park.removeFirst());
        route.addFirst(park.removeFirst());
        park.print();
        route.print();
        park.addFirst(route.removeFirst());
        park.print();
        route.print();
    }

    private static void generate3TroleyBus(LinkedListNode park) {
        park.addFirst(new TroleyBus( 111));
        park.addFirst(new TroleyBus( 112));
        park.addFirst(new TroleyBus( 113));

    }
    private static void generate3TroleyBus2Bus(LinkedListNode park) {
        park.addFirst(new TroleyBus( 111));
        park.addFirst(new TroleyBus( 112));
        park.addFirst(new TroleyBus( 113));
        park.addFirst(new Bus("Tom3", 13));
        park.addFirst(new Bus("Tom4", 14));

    }
    private static void generate4Bus(LinkedListNode park) {
        park.addFirst(new Bus("Tom1", 11));
        park.addFirst(new Bus("Tom2", 12));
        park.addFirst(new Bus("Tom3", 13));
        park.addFirst(new Bus("Tom4", 14));
    }
}
