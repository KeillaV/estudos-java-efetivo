package org.chapter3.item14;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {

    public static void main(String[] args) {
        var book1 = new Book("Java Efetivo", Genre.TECH, 412);
        var book2 = new Book("O Castelo Animado", Genre.FANTASY, 368);
        var book3 = new Book("Crime e Castigo", Genre.DRAMA, 688);
        var book4 = new Book("Jogos Vorazes", Genre.DYSTOPIA, 400);

        var bookList = Arrays.asList(book1, book2, book3, book4);
        bookList.forEach(System.out::println);

        System.out.println("\nOrdering elements... \n");
        bookList.sort(Comparator.naturalOrder());
        bookList.forEach(System.out::println);
    }
}
