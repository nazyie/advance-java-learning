package functionalprogramming.stream.implementingstream;

import java.util.ArrayList;

/**
 * Advance stream implementation
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = populateLibrary();

        // parrallelStream depends on the machine performance
        //      if you want to apply the parallel stream of use parallelStream() instead
        //      the impact would be more efficient if u use multi core machine to executing it
        bookArrayList.stream().filter(book -> {
            return book.getAuthor().startsWith("A. Samad");
        }).filter(book -> {
            return book.getTitle().startsWith("Puisi terakhir");
        }).forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("A. Samad Said", "Puisi terakhir"));
        books.add(new Book("A. Abdul Said", "Puisi permulaan"));
        books.add(new Book("A. K Said", "Puisi pertengahan"));
        books.add(new Book("A. Samad Said", "Puisi diatas"));
        books.add(new Book("A. Samad Said", "Puisi dibawah"));
        books.add(new Book("A. Chong Said", "Puisi buatmu sayang"));
        books.add(new Book("A. Samad Said", "Puisi terindah"));

        return books;
    }
}
