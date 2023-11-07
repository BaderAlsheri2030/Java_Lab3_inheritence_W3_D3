import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Media> medias  = new ArrayList<Media>();


    public Store() {
    }


    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> displayUsers(){
        return users;
    }
    public void  addMedia(Media media){
    medias.add(media);
    }

    public ArrayList<Media> displayMedia(){
        return medias;
    }
    public Book searchBook(String title){
        List<Book> bookList = new ArrayList<Book>();
        Book b =new Book();
        for (Book book:bookList) {
            if (book.getTitle().equalsIgnoreCase(title)){
                 b =book;
                break;
            }
        }
        return b;
    }

}
