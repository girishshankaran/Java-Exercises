package example.com;

import java.time.LocalDate;
import java.util.ArrayList;

public class Flight {
    int id;
    String origin;
    String destination;
    LocalDate departure;
    int passengerId;
    static ArrayList<Flight> allFlights = new ArrayList<>();

    public Flight(int id, String origin, String destination, LocalDate departure, int passengerId) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.passengerId = passengerId;
        allFlights.add(this);
    }

    // Returns the flight IDs for a given passenger as an int array
    public static int[] getFlightsByPassenger(int passengerId) {
        ArrayList<Integer> idsList = new ArrayList<>();
        for (Flight f : allFlights) {
            if (f.passengerId == passengerId) idsList.add(f.id);
        }
        // Convert ArrayList<Integer> to int[]
        int[] ids = new int[idsList.size()];
        for (int i = 0; i < idsList.size(); i++) {
            ids[i] = idsList.get(i);
        }
        return ids;
    }

    // Returns the Flight object for a given id
    public static Flight getFlight(int id) {
        for (Flight f : allFlights) {
            if (f.id == id) return f;
        }
        return null;
    }
}
