package org.chapter3.item14;

import java.util.Comparator;

import static java.util.Comparator.comparing;

// Item 14: testing Java 8 comparator
public class Anime implements Comparable<Anime> {

    private final String title;
    private final Genre genre;
    private final String studio;
    private final int episodes;
    public static final Comparator<Anime> COMPARATOR = comparing(Anime::getTitle, String.CASE_INSENSITIVE_ORDER)
                                                    .thenComparing(Anime::getGenre)
                                                    .thenComparing(Anime::getStudio, String.CASE_INSENSITIVE_ORDER)
                                                    .thenComparingInt(Anime::getEpisodes);

    public Anime(final String title, final Genre genre, final String studio, final int episodes) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
        this.episodes = episodes;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Anime)) {
            return false;
        }

        Anime otherAnime = (Anime) object;
        return (this.title.equals(otherAnime.getTitle())) &&
                (this.genre.equals(otherAnime.getGenre())) &&
                (this.studio.equals(otherAnime.getStudio())) &&
                (this.episodes == otherAnime.getEpisodes());
    }

    @Override
    public int hashCode() {
        int result = this.title.hashCode();
        result = 31 * result + this.genre.hashCode();
        result = 31 * result + this.studio.hashCode();
        result = 31 * result + Integer.hashCode(episodes);

        return result;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.studio + ", " + this.episodes + " episodes)";
    }

    @Override
    public int compareTo(Anime anime) {
        return COMPARATOR.compare(this, anime);
    }

    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public String getStudio() {
        return this.studio;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
