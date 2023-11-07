import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel() {
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(int stock, ArrayList<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public Novel(String title, String author, String ISBN, double price, int stock, ArrayList<Review> reviews, String genre) {
        super(title, author, ISBN, price, stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType(){
        if (getAverageRatting() >= 4.5) return "BestSelling Novel";
        else return "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" +getTitle()+ '\'' +
                "genre='" + genre + '\'' +
                '}';
    }
}
