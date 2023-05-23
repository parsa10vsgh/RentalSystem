import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {
    private final Item item;
    private final Customer customer;
    private final Date rentalDate;
    private Date returnDate;
    private final int ID;

    public Rental(Item item, Customer customer, int ID) {
        this.item = item;
        this.ID = ID;
        this.customer = customer;
        this.rentalDate = new Date();
        this.returnDate = new Date(rentalDate.getTime() + TimeUnit.DAYS.toMillis(7));
    }

    public int getID() {
        return ID;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Item getItem() {
        return item;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
