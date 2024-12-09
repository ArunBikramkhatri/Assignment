import java.util.HashMap;
import java.util.Map;;

public class UpdateCustomer {

    private Map<Integer, Customer> Customers = new HashMap<>();

    public void updateCustomer(int customerId) {
        if (Customers.containsKey(customerId)) {
            Customer oldProfile = Customers.get(customerId);
            Customer newProfile = new Customer(
                    oldProfile.getOldCustomerId(),
                    oldProfile.getName(),
                    oldProfile.getAddress(),
                    oldProfile.getRfidNumber(),
                    oldProfile.getJoinedDate());
            Customers.remove(customerId);
            Customers.put(customerId, newProfile);
        }
    }

    public void addNewCustomer(String name, String address, String rfidNumber, String joinedDate) {
        Customer newProfile = new Customer(name, address, rfidNumber, joinedDate);
        Customers.put(newProfile.getOldCustomerId(), newProfile);
    }

    public void displayCustomers() {
        for (Customer customer : Customers.values()) {
            System.out.println(customer.toString());
        }
    }

    public static void main(String[] args) {
        UpdateCustomer updater = new UpdateCustomer();

        // test customers
        updater.addNewCustomer("Arun", "Lalitpur", "RFID001", "2081-01-01");
        updater.addNewCustomer("Rikesh", "Bhaktapur", "RFID002", "2082-02-01");

        System.out.println("before update:");
        updater.displayCustomers();

        updater.updateCustomer(1002);
        updater.updateCustomer(9999);

        System.out.println("after update:");
        updater.displayCustomers();
    }
}
