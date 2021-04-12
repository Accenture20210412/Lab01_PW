package wojtal.paulina;

public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private Trip trip;

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Customer(String firstName, String lastName, String address, Trip trip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.trip = trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
        return address != null ? address.equals(customer.address) : customer.address == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return String.format("%s %s, address: %s, trip: %s", firstName, lastName, address, trip);
    }
}
