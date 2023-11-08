import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            System.out.println("----------------------------");
            //instance of class Media
            ArrayList <Media> m1 = new ArrayList<Media>();

            Media media1  = new Media("Book101","author1","110223",50.0);
            m1.add(media1);
            Media media2 =new Media("Integral Mathematics","author23","123214",500);
            m1.add(media2);
            System.out.println(m1);
            System.out.println("-------------------------------");

            //Array list of type review

            ArrayList<Review> booksReviews = new ArrayList<Review>();
            ArrayList<Media> books = new ArrayList<Media>();


            //instance of class Book
            Book book1 = new Book("Java101","Muhammed k","111022",80.0,5,booksReviews);
            books.add(book1);
            System.out.println(book1.toString());

            //instances of class Review
            Review review1 = new Review("Bader",9,"very good book");
            booksReviews.add(review1);
            Review review2 = new Review("Abdullah",3,"Very disappointing :( ");
            booksReviews.add(review2);
            Review review3 = new Review("muhammed",6,"It's a nice book!");
            booksReviews.add(review3);

            System.out.println("Average rating: "+book1.getAverageRatting());
            System.out.println(book1.getTitle()+" Is The "+book1.getMediaType());
            System.out.println("--------------------------------");
            //-----------------------------------------


            //two arrays of class Media, addToCart is to add media to cart for a user
            //PurchaseMedia is to purchase media for a user
            ArrayList<Media> addToCart = new ArrayList<Media>();
            ArrayList<Media> purchaseMedia = new ArrayList<Media>();
            //Instances of class Movie


            ArrayList<Movie> movies = new ArrayList<Movie>();
            Movie movie1 = new Movie("Pirates of the caribbean I","ted elliot","1423110900",100,120);
            Movie movie2 = new Movie("Pirates of the caribbean II","ted elliot","1422210900",150,160);
            Movie movie3 = new Movie("The Batman","Matt Reeves","1779514298",130,175);
            movies.add(movie1);
            movies.add(movie2);
//            movies.add(movie3);
            System.out.println("Similar Movies with the same author"+movie1.recommendSimilarMovies(movies));

            //added movie2 to purchased list
            purchaseMedia.add(movie2);
            System.out.println("-------------------------");

            System.out.println(movie2.getTitle()+" is a "+movie2.getMediaType());

            System.out.println("-------------------------");


            //Music


            Music song1 = new Music("Billie Jean","Michael Jackson","3456784234",40,"Michael Jackson");
            Music song2 = new Music("Beat it","Michael Jackson","343243484234",30,"Michael Jackson");
            System.out.println(song1.getTitle()+" is a "+song1.getMediaType());
            System.out.println("-------------------------");


            //added song1,song2,movie1 to the cart

            addToCart.add(song1);
            addToCart.add(song2);
            addToCart.add(movie1);
            addToCart.add(movie3);

            User user1 = new User("bader_14256","bader@test.com",purchaseMedia,addToCart);
            System.out.println("user: "+user1.getUsername()+" Purchased Media:  "+user1.getPurchasedMediaList());
            System.out.println("Media added to the cart: "+user1.getShoppingCart());
            song1.listen(user1);
            System.out.println("-------------------------");

            ArrayList<Novel> novels = new ArrayList<Novel>();
            ArrayList<Review> novelsReviews = new ArrayList<Review>();
            Novel novelOne = new Novel("No longer human","Osamu Dazai","0811204812",54,1,novelsReviews,"Non-fiction");
            Novel novelTwo = new Novel("The house","jordan","123456732",90,2,novelsReviews,"Drama");
            novels.add(novelOne);
            novels.add(novelTwo);
            System.out.println("-------------------------");

            Review r1 = new Review("eman",10,"I enjoyed reading this novel, 100% recommend");
            novelsReviews.add(r1);
            Review r2 = new Review("sara",6,"I liked it");
            novelsReviews.add(r2);
            System.out.println(novelOne.getTitle()+" genre is "+novelOne.getGenre());



            // System.out.println(novels);

            System.out.println("All novel reviews: "+novelsReviews);
            System.out.println("-------------------------");

            //

            ArrayList<AcademicBook> academicBooks = new ArrayList<AcademicBook>();
            ArrayList<Review> academicBooksReviews = new ArrayList<Review>();
            Review r3 = new Review("maram",7,"");
            academicBooksReviews.add(r3);
            Review r4 = new Review("Ahmad",6,"Helped me advancing in my field");
            academicBooksReviews.add(r4);
            Review r5 = new Review("Ahmad",10,"Very good");
            academicBooksReviews.add(r5);
            System.out.println("-------------------------");

            AcademicBook academicBook1 = new AcademicBook("Software engineering architecture","Dr. zakaria","12343564234",200,5,academicBooksReviews,"Computer science discipline");
            academicBooks.add(academicBook1);
            System.out.println(academicBook1.getTitle()+" Is The "+academicBook1.getMediaType()+" with "+academicBook1.getAverageRatting()+" average rating");
            System.out.println(academicBook1.toString());
            System.out.println("-----------------");




            user1.addTocart(academicBook1);
            System.out.println("user: "+user1.getUsername()+" Purchased Media:  "+user1.getPurchasedMediaList());
            System.out.println("Media added to the cart: "+user1.getShoppingCart());
            user1.removeFromCart(academicBook1);
            user1.removeFromCart(song1);
            user1.removeFromCart(song2);
            System.out.println("Updated Media in cart: "+user1.getShoppingCart());

            addToCart.add(novelOne);



            ArrayList<Media> addToCart2 = new ArrayList<Media>();
            ArrayList<Media> purchaseMedia2 = new ArrayList<Media>();


            //

            User user2 = new User("Reham_2","reham@test.com",purchaseMedia2,addToCart2);
            System.out.println(book1.getStock());

            Store store1 = new Store();
            store1.addUser(user1);
            store1.addUser(user2);
            store1.addMedia(movie3);
            store1.addMedia(movie2);
            store1.addMedia(movie1);
            store1.addMedia(novelOne);
            store1.addMedia(novelTwo);
            store1.addMedia(book1);
            System.out.println("List of users in store: "+store1.displayUsers());
            System.out.println("List of media in the store: "+store1.displayMedia());
            System.out.println("is it empty ? "+user1.getShoppingCart());

//            try {
//
//
//                    user1.checkout();
//            }catch (Exception e){
//                    System.out.println(e.getMessage());
//            }
            user1.checkout();

            System.out.println("is it empty ? "+user1.getShoppingCart());














    }
}