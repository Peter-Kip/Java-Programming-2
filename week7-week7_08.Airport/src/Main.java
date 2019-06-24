
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Plane plane = new Plane();
        Flight flights = new Flight();

        Airport airport = new Airport(reader, plane, flights);
        airport.start();
        
    }
}
