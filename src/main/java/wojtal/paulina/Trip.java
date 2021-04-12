package wojtal.paulina;

import java.time.LocalDate;

public class Trip {

    private LocalDate startDate;
    private LocalDate endDate;
    private String destination;
    private int price;

    public Trip(LocalDate startDate, LocalDate endDate, String destination, int price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.destination = destination;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if (getPrice() != trip.getPrice()) return false;
        if (startDate != null ? !startDate.equals(trip.startDate) : trip.startDate != null) return false;
        if (endDate != null ? !endDate.equals(trip.endDate) : trip.endDate != null) return false;
        return destination != null ? destination.equals(trip.destination) : trip.destination == null;
    }

    @Override
    public int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + getPrice();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Trip to %s, from %s till %s, price = %d", destination, startDate, endDate, getPrice());
    }
}
