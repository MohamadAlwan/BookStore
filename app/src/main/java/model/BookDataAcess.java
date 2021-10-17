package model;

import java.util.ArrayList;
import java.util.List;

  class BookDataAcess implements  InterfaceBookDataAcess{

    private ArrayList<Book> books = new ArrayList<>();

    public BookDataAcess() {
        books.add(new Book(300, "thinking in java", "Java"));
        books.add(new Book(380, "hi java", "Java"));
        books.add(new Book(450, "thinking in c", "c"));
        books.add(new Book(800, "Beginning c# Development", "c#"));

    }

    public List<Book> getBooks(String cat) {
        ArrayList<Book> data = new ArrayList<>();
        for (Book b : books) {
              if(b.getCategory().equals(cat)){
                  data.add(b);
              }

        }
        return data;
    }

      @Override
      public String[] getCategories() {
        String[] cats = {"Java", "c" , "c#"};
          return cats;
      }
  }


