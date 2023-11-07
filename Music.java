import java.util.ArrayList;
import java.util.List;

public class Music extends Media{

    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public void listen(User user){
    Media music = new Media();
    user.getPurchasedMediaList().add(music);
    }


    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicatalog){
        ArrayList<Music> similarSongs = new ArrayList<Music>();
        for (Music m: musicatalog) {
            if (m.getArtist().equalsIgnoreCase(getArtist())){
                similarSongs.add(m);
            }
        }
        return similarSongs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMediaType(){
        if (getPrice() >=10) return "Premium music";
        else return "music" ;
    }

    @Override
    public String toString() {
        return "Music{" + '\'' +
                "artist='" + artist + '\'' +
                "Title='"  + getTitle()+'\'' +
                '}';
    }
}
