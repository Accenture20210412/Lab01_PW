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

        Customer customer1 = new Customer("Jan", "Kowalski", "Kraków");
        Customer customer2 = new Customer("Arnold", "Borne", "Warszawa");
        Customer customer3 = new Customer("Maria", "Artel", "Warszawa");

        Trip trip = new Trip(LocalDate.of(2021, 5, 23), LocalDate.of(2021, 6, 3), "Rome", 1000);
        Trip abroadTrip1 = new AbroadTrip(LocalDate.of(2021,8,12),
                LocalDate.of(2021,8,25),
                "Madrid",
                2000,
                150);
        Trip domTrip1 = new DomesticTrip(LocalDate.of(2021, 7, 3),
                LocalDate.of(2021, 7, 8),
                "Malbork",
                1500,
                300);

        customer1.setTrip(abroadTrip1);
        customer2.setTrip(domTrip1);
        customer3.setTrip(trip);

        TravelOffice travelOffice = new TravelOffice();
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);

        System.out.println(travelOffice.getCustomersInfo());
    }
}
