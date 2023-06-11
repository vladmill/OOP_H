package homework01.task03;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public Book(String title, String author) {
        this(title, author, true);
    }

    public void displayInfo() {
        System.out.printf("""
                        Название: %s
                        Автор: %s
                        Доступность: %s
                        """,
                title,
                author,
                available ? "да" : "нет");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.getTitle()) && Objects.equals(author, book.getAuthor());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
