package model;

import java.util.List;

public interface InterfaceBookDataAcess {

    List<Book> getBooks(String cat);

     String[] getCategories(); //to get data that's will fill in the Spinner
}
