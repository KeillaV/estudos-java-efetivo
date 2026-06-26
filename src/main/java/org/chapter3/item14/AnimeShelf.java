package org.chapter3.item14;

import java.util.Arrays;
import java.util.Comparator;

public class AnimeShelf {

    public static void main(String[] args) {
        var anime1 = new Anime("Vinland Saga", Genre.DRAMA, "Wit Studio", 24);
        var anime2 = new Anime("One Piece", Genre.ADVENTURE, "Toei Animation", 1000);
        var anime3 = new Anime("One Piece", Genre.ADVENTURE, "Mappa", 1000);
        var anime4 = new Anime("Spy x Family", Genre.COMEDY, "Wit Studio", 24);

        var animeList = Arrays.asList(anime1, anime2, anime3, anime4);
        animeList.forEach(System.out::println);

        System.out.println("\nOrdering elements... \n");
        animeList.sort(Comparator.naturalOrder());
        animeList.forEach(System.out::println);
    }

}
