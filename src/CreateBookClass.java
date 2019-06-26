import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CreateBookClass {

    private String title;
    private String author;
    private String description;
    private Double price;
    private Boolean isInStock;


    public CreateBookClass() {
    }

    public CreateBookClass(String title, String author, String description, Double price, Boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Double findPrice(CreateBookClass newbook1, int reqNumber){
        String title = this.title;
        Double price = this.price;

        return (this.price * reqNumber);
    }

    public String displayMessage(){
        return "\nTitle: " +  title + "\nAuthor:" + author + "\nDescription: " + description + "\nPrice: " + price + "\nIn Stock: " + isInStock;
    }

    public String bookTitle(){
        return title;
    }

    public Boolean bookAvail(){
        if (isInStock){
            return true;}
        else {
            return false;
        }
    }

    public Double requestPrice(int reqNumber){

        double price = this.price * reqNumber;

        return price;
    }

    public String displayMessage1(){
        return title + " | " + author + " | " + description;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

}
