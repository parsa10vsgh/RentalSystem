import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String email;
    private final String phone;
    private final String address;
    private final int ID;
    private final List<Rental> rental;

    public Customer(String name, String email, String phone, String address , int ID) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.ID = ID;
        this.rental = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<Rental> getRental() {
        return rental;
    }
}
