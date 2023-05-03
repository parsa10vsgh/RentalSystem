import java.util.Date;

public class Item {
    private final String title;
    private final  String genre;
    private final Date release;
    private final int rentalFee;
    private final int ID;
    private Boolean available;
    public Item(String title,String genre,Date release,int rentalFee,int ID){
        this.ID = ID;
        this.release = release;
        this.rentalFee = rentalFee;
        this.genre = genre;
        this.title = title;
        this.available = true;
    }

    public int getID() {
        return ID;
    }

    public Date getRelease() {
        return release;
    }

    public int getRentalFee() {
        return rentalFee;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void rentItem(Customer customer) {}
    public void returnItem(Customer customer) {}
}

