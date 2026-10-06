import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", 1937, true);
        Book book2 = new Book(2, "1984", "George Orwell", 1949, true);
        Book book3 = new Book(3, "Animal Farm", "George Orwell", 1945, false);
        Book book4 = new Book(4, "The Great Gatsby", "F. Scott Fitzgerald", 1925, true);
        Book book5 = new Book(5, "Harry Potter", "J.K. Rowling", 1997, true);
        Book book6 = new Book(6, "The Da Vinci Code", "Dan Brown", 2003, false);
        Book book7 = new Book(7, "The Alchemist", "Paulo Coelho", 1988, true);
        Book book8 = new Book(8, "The Martian", "Andy Weir", 2011, true);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getYear() < 2000){
                iterator.remove();
            }
        }

        for (Book book : books) {
            System.out.println(books);
        }

//        for (Book book : books) {
//            if (book.getYear() < 2000) {
//                books.remove(book);
//            }
//        }

    }
}