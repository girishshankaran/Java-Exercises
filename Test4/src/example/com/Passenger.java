package example.com;

import java.util.ArrayList;

public class Passenger {
    int id; // Unique identifier of the passenger
    String name; // Name of the passenger
    static ArrayList<Passenger> allPassengers = new ArrayList<>();

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
        allPassengers.add(this);
    }

    // Returns the passenger identifiers as an int array
    public static int[] getPassengers() {
        int[] ids = new int[allPassengers.size()];
        for (int i = 0; i < allPassengers.size(); i++) {
            ids[i] = allPassengers.get(i).id;
        }
        return ids;
    }

    // Returns the Passenger object for a given id
    public static Passenger getPassenger(int id) {
        for (Passenger p : allPassengers) {
            if (p.id == id) return p;
        }
        return null;
    }
}
