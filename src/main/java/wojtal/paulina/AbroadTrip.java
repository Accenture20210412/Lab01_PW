package wojtal.paulina;

import java.time.LocalDate;

public class AbroadTrip extends Trip{

    private int insurance;

    public AbroadTrip(LocalDate startDate, LocalDate endDate, String destination, int price, int insurance) {
        super(startDate, endDate, destination, price);
        this.insurance = insurance;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + insurance;
    }

    @Override
    public String toString() {
        return super.toString() + ", insurance = " + insurance;
    }
}
