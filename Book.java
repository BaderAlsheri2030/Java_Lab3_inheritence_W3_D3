import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
    private ArrayList<Review>  reviews = new ArrayList<Review>();

    public Book() {
    }

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String author, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, author, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review r){
        reviews.add(r);
    }

    public double getAverageRatting(){
        double r1 = 0;
        for (Review r: reviews) {
            r1 += r.getRating();
        }

       return r1/getReviews().size();
    }

    public void purchase(User user){
        Book book = new Book();
        user.getPurchasedMediaList().add(book);
        setStock(book.getStock()-1);
    }

    public boolean isBestSeller(){
        return getAverageRatting() >= 4.5;
    }

    public void restock(int quantity){
        setStock(getStock()+quantity);
        System.out.println("You have restocked "+quantity+", Available stocked books: "+getStock());

    }

    public String getMediaType(){
        if(isBestSeller())
        return "BestSelling Book";
        else return "Book";
    }

    public String toString(){
        return "Title: "+getTitle()+", Author: "+getAuthor()+", ISBN: "+getISBN()+". Price "+getPrice()+" Stock: "+getStock()+" Reviews"+getReviews();
    }




}
