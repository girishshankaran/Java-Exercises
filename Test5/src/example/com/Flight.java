package example.com;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Flight {
    private int id; // Unique identifier of the flight
    private LocalDate departure;
    private String origin;
    private String destination;
    private int passengerId; // For simplicity, one passenger per flight in this example

    public Flight(int id, String origin, String destination, String departure, int passengerId) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.departure = LocalDate.parse(departure, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        this.passengerId = passengerId;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPassengerId() {
        return passengerId;
    }

    // Simulated data store for demonstration
    private static List<Flight> flights = new ArrayList<>();

    public static void addFlight(Flight f) {
        flights.add(f);
    }

    public static int[] getFlightsByPassenger(int passengerId) {
        return flights.stream()
                .filter(f -> f.getPassengerId() == passengerId)
                .mapToInt(Flight::getId)
                .toArray();
    }

    public static Flight getFlight(int id) {
        for (Flight f : flights) {
            if (f.getId() == id) return f;
        }
        return null;
    }
}
