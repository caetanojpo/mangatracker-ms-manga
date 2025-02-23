package com.mangatracker.manga.domain.builders;

import com.mangatracker.manga.domain.entities.Manga;
import com.mangatracker.manga.domain.enums.MangaStatus;

import java.util.*;

public class MangaBuilder {
    private String id;
    private String title;
    private List<String> altTitles = new ArrayList<>();
    private List<String> description = new ArrayList<>();
    private MangaStatus status;
    private int year;
    private Set<String> genres = new HashSet<>();
    private String originalLanguage;
    private String demographic;
    private String contentRating;
    private List<String> tags = new ArrayList<>();
    private Map<String, String> links = new HashMap<>();
    private List<String> availableTranslatedLanguages = new ArrayList<>();
    private String lastVolume;
    private String lastChapter;
    private boolean isLocked;
    private String state;

    public MangaBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public MangaBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MangaBuilder setAltTitles(List<String> altTitles) {
        this.altTitles = altTitles;
        return this;
    }

    public MangaBuilder setDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public MangaBuilder setStatus(MangaStatus status) {
        this.status = status;
        return this;
    }

    public MangaBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public MangaBuilder setGenres(Set<String> genres) {
        this.genres = genres;
        return this;
    }

    public MangaBuilder setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
        return this;
    }

    public MangaBuilder setDemographic(String demographic) {
        this.demographic = demographic;
        return this;
    }

    public MangaBuilder setContentRating(String contentRating) {
        this.contentRating = contentRating;
        return this;
    }

    public MangaBuilder setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public MangaBuilder setLinks(Map<String, String> links) {
        this.links = links;
        return this;
    }

    public MangaBuilder setAvailableTranslatedLanguages(List<String> availableTranslatedLanguages) {
        this.availableTranslatedLanguages = availableTranslatedLanguages;
        return this;
    }

    public MangaBuilder setLastVolume(String lastVolume) {
        this.lastVolume = lastVolume;
        return this;
    }

    public MangaBuilder setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
        return this;
    }

    public MangaBuilder setLocked(boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public MangaBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public Manga build() {
        return new Manga(id, title, altTitles, description, status, year, genres, originalLanguage, demographic,
                contentRating, tags, links, availableTranslatedLanguages, lastVolume, lastChapter, isLocked, state);
    }
}
