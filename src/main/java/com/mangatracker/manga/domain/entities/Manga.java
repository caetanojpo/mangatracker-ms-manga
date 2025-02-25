package com.mangatracker.manga.domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Manga {
    private final String id;
    private final String title;
    private final String description;
    private final String originalLanguage;
    private final String lastVolume;
    private final String lastChapter;
    private final String publicationDemographic;
    private final String status;
    private final Integer year;
    private final String contentRating;
    private final List<String> tags;
    private final String coverId;

    public Manga(
            String id,
            String title,
            String description,
            String originalLanguage,
            String lastVolume,
            String lastChapter,
            String publicationDemographic,
            String status,
            Integer year,
            String contentRating,
            List<String> tags,
            String coverId
    ) {
        this.id = Objects.requireNonNull(id, "ID cannot be null");
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        this.originalLanguage = Objects.requireNonNull(originalLanguage, "Original language cannot be null");
        this.status = Objects.requireNonNull(status, "Status cannot be null");

        this.description = description;
        this.lastVolume = lastVolume;
        this.lastChapter = lastChapter;
        this.publicationDemographic = publicationDemographic;
        this.year = year;
        this.contentRating = contentRating;
        this.tags = tags == null ? new ArrayList<>() : Collections.unmodifiableList(tags);
        this.coverId = coverId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getLastVolume() {
        return lastVolume;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public String getPublicationDemographic() {
        return publicationDemographic;
    }

    public String getStatus() {
        return status;
    }

    public Integer getYear() {
        return year;
    }

    public String getContentRating() {
        return contentRating;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getCoverId() {
        return coverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", lastVolume='" + lastVolume + '\'' +
                ", lastChapter='" + lastChapter + '\'' +
                ", publicationDemographic='" + publicationDemographic + '\'' +
                ", status='" + status + '\'' +
                ", year=" + year +
                ", contentRating='" + contentRating + '\'' +
                ", tags=" + tags +
                ", coverId='" + coverId + '\'' +
                '}';
    }
}
