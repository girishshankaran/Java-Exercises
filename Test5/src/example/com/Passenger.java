package example.com;
import java.util.*;

public class Passenger {
    private int id; // Unique identifier of the passenger
    private String name; // Name of the passenger

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Simulated data store for demonstration
    private static List<Passenger> passengers = new ArrayList<>();

    public static void addPassenger(Passenger p) {
        passengers.add(p);
    }

    public static int[] getPassengers() {
        return passengers.stream().mapToInt(Passenger::getId).toArray();
    }

    public static Passenger getPassenger(int id) {
        for (Passenger p : passengers) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
