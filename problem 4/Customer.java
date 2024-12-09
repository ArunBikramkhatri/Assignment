import java.util.UUID;

public class Customer {
    private int oldCustomerId;
    private UUID newCustomerId;
    private String name;
    private String address;
    private String rfidNumber;
    private String joinedDate;

    public Customer(int oldCustomerId, String name, String address,
            String rfidNumber, String joinedDate) {
        this.oldCustomerId = oldCustomerId;
        this.newCustomerId = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.rfidNumber = rfidNumber;
        this.joinedDate = joinedDate;
    }

    // for new customer
    public Customer(String name, String address, String rfidNumber, String joinedDate) {
        this.oldCustomerId = 0;
        this.newCustomerId = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.rfidNumber = rfidNumber;
        this.joinedDate = joinedDate;
    }

    public int getOldCustomerId() {
        return oldCustomerId;
    }

    public void setOldCustomerId(int oldCustomerId) {
        this.oldCustomerId = oldCustomerId;
    }

    public UUID getNewCustomerId() {
        return newCustomerId;
    }

    public void setNewCustomerId(UUID newCustomerId) {
        this.newCustomerId = newCustomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRfidNumber() {
        return rfidNumber;
    }

    public void setRfidNumber(String rfidNumber) {
        this.rfidNumber = rfidNumber;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name : " + name + " \nnew id :" + newCustomerId + "\n old id : " + oldCustomerId;
    }

}
