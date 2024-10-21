package _03_behavioral_patterns._16_iterator.exam01;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> books = new ArrayList<>();

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
