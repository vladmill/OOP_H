package homework01.task03;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {

    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }
}
