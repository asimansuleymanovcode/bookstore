package az.code.bookstore;

import az.code.bookstore.model.Book;
import az.code.bookstore.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        int year = 1900;
        int page = 11;
        for(int i = 0; i < 15; i++){
            Book myBook = new Book("name" + i, "author" + i, year++, page++ );
            List<Unit> units = new ArrayList<>();
            for(int j = 0; j < 3; j++){
                units.add(new Unit("header_" + i + "_" +j, 10, "header" + j));
            }
            myBook.setUnits(units);
            books.add(myBook);
        }
        for(Book book: books){
            System.out.println(book.getDetails());
        }
    }
}
