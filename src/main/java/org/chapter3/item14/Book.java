package org.chapter3.item14;

// Item 14: Implementing Comparable interface
public class Book implements Comparable<Book>{

    private final String title;
    private final Genre genre;
    private final int pages;

    public Book(final String title, final Genre genre, final int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Book)) {
            return false;
        }

        Book otherBook = (Book) object;

        return (otherBook.getTitle().equals(this.title) &&
                (otherBook.getGenre().equals(this.genre) &&
                (otherBook.getPages() == this.pages)));
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + Integer.hashCode(pages);

        return result;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.genre.name() + ", " + this.pages + " pages)";
    }

    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public int compareTo(Book otherBook) {
        int result = this.title.compareTo(otherBook.getTitle());

        if (result == 0) {
            result = this.genre.compareTo(otherBook.getGenre());

            if (result == 0) {
                result = Integer.compare(this.pages, otherBook.getPages());
            }
        }
        return result;
    }

}
