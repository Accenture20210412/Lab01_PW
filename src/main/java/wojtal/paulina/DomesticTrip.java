package wojtal.paulina;

import java.time.LocalDate;

public class DomesticTrip extends Trip{

    private int ownAccessDiscount;

    public DomesticTrip(LocalDate startDate, LocalDate endDate, String destination, int price, int ownAccessDiscount) {
        super(startDate, endDate, destination, price);
        this.ownAccessDiscount = ownAccessDiscount;
    }

    @Override
    public int getPrice() {
        return super.getPrice() - ownAccessDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", discount = " + ownAccessDiscount;
    }
}
