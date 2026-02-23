package OOPS;
public class Library {
    int book_number;
    String book_name;
    String book_author;
    String book_genre;
    float book_price;

    public Library(int book_number, String book_name, String book_author,String book_genre, float book_price){
        this.book_number=book_number;
        this.book_name=book_name;
        this.book_author=book_author;
        this.book_genre=book_genre;
        this.book_price=book_price;
    }

    public Library() {

    }
}
