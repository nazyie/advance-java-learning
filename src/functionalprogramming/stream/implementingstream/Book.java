package functionalprogramming.stream.implementingstream;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Author :" + author + " || Title: " + title;
    }

}
