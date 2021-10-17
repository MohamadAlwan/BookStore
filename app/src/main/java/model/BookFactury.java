package model;

public class BookFactury {
    public  InterfaceBookDataAcess getModel(){
        return new BookDataAcess();
    }
}
