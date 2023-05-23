import java.util.ArrayList;
import java.util.List;

public class RentalStore {
    private final List<Customer> customers;
    private final List<Item> items;
    private final List<Item> availableItems;

    public RentalStore() {
        this.availableItems = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Item> getAvailableItems() {
        return availableItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.availableItems.add(item);
    }

    public void removeItem(Item item) {
        this.availableItems.remove(item);
        this.items.remove(item);
    }
    public void register(Customer customer) {
        this.customers.add(customer);
    }
    public Item getItemBiID(int ID) {
        for(Item item:items) {
            if(item.getID() == ID) {
                return item;
            }
        }
        return null;
    }

    public Customer getCustomByID(int ID) {
        for(Customer customer:customers) {
            if (customer.getID() == ID) {
                return customer;
            }
        }
        return null;
    }

    public void rentItem(Item item, Customer customer) {
        if (this.availableItems.contains(item) && this.customers.contains(customer)) {
            item.rentItem(customer);
        }
        this.availableItems.remove(item);
    }

    public void returnItem(Rental rental) {
        rental.getItem().returnItem(rental);
        this.availableItems.add(rental.getItem());
    }
}
