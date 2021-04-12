package wojtal.paulina;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        Customer custmmr = new Customer("Jan", "Kowalski", "Kraków");
        //Trip trip = new Trip(LocalDate.of(2021, 5, 23), LocalDate.of(2021, 6, 3), "Rome", 1000);
        //custmmr.setTrip(trip);
        System.out.println(custmmr.toString());
    }
}
