package Task.OOPS;
public class Book {
    String bookname;
    String bookauthor;
    long bookisbn;
    public void add_Book(String BookName,String BookAuthor,long BookISBN){
        bookname=BookName;
        bookauthor=BookAuthor;
        bookisbn=BookISBN;
    }
    public void display(){
        System.out.println(bookname);
        System.out.println(bookauthor);
        System.out.println(bookisbn);
    }
    static void main(String[] args) {
        Book book = new Book();
        book.add_Book("The Baby Name Wizard","Laura Wattenberg",123959549);
        book.display();
    }
}
