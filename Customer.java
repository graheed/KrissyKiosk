package MainCode2;
import MainCode2.User;
public class Customer extends User {
    private String address;
    private String phone;

    /**
     * Constructs a new Customer object with the given information.
     *
     * @param id       the ID of the customer
     * @param name     the name of the customer
     * @param email    the email of the customer
     * @param password the password of the customer
     * @param address  the address of the customer
     * @param phone    the phone number of the customer
     */
    public Customer(String id, String name, String email, String password,String address, String phone) {
        super(id, name, email, password);
        this.address = address;
        this.phone = phone;
        this.privilege = false;

    }
    public String getAddress() {
    	return this.address;
    }
    
    public String getPhone() {
    	return this.phone;
    }
}
