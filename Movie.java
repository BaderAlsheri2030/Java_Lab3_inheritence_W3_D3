import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie() {

    }
    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
    Media movie = new Media();
    user.getPurchasedMediaList().add(movie);
    }


    public List<Movie> recommendSimilarMovies(List<Movie> MovieCatalog){
        List<Movie> rSimilar = new ArrayList<>();
        for (Movie m: MovieCatalog) {
            if (m.getAuthor().equals(getAuthor())){
            rSimilar.add(m);
            }
        }
        return rSimilar;
    }

    public String getMediaType(){
        if (getDuration() >=120) return "Long Movie";
        else return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() + '\''+
                ", Duration="+ duration+ '\''+
                '}';

    }
}
