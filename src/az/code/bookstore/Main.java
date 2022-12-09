package az.code.bookstore;

import az.code.bookstore.model.Book;
import az.code.bookstore.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void test(int a){
        short s = (short)a;
    }
    public static void main(String[] args) {
        int a = 2000000;

        List<Book> books = new ArrayList<>();
        int year = 1900;
        int page = 30;
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
           String validationMessage = book.isValidPageCount() ? "valid" : "Invalid";
           System.out.println(validationMessage);

            System.out.println("----------------");
        }
    }
}
