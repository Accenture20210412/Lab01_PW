package wojtal.paulina;

import java.util.Arrays;

public class TravelOffice {

    private Customer[] customers;

    {
        customers = new Customer[2];
    }

    public boolean addCustomer(Customer customer) {
        if (customers[0] == null) {
            customers[0] = customer;
            return true;
        }

        if (customers[customers.length - 1] == null) {
            customers[customers.length - 1] = customer;
            return true;
        }

        return expandArrayAndAddNewCustomer(customer);
    }

    private boolean expandArrayAndAddNewCustomer(Customer customer) {
        Customer[] newCustomersArray = Arrays.copyOf(customers, customers.length + 2);
        newCustomersArray[newCustomersArray.length - 2] = customer;
        customers = newCustomersArray;
        return true;
    }

    public String getCustomersInfo() {
        return Arrays.toString(customers);
    }

    public int getSize() {
        return customers.length;
    }
}

