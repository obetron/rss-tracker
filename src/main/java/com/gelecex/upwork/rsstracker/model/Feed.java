package com.gelecex.upwork.rsstracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

/**
 * @author obetron
 * @date 28.10.2023 - 19:46
 */
@Entity
public class Feed {

    @Id
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "link")
    private String link;
    @Column(name = "description")
    private String description;
    @Column(name = "publication_date")
    private LocalDateTime publicationDate;
    @Column(name = "author")
    private String author;
    @Column(name = "thumbnails")
    private String thumbnails;
    @Column(name = "categories")
    private String categories;
    @Column(name = "related_identifiers")
    private String relatedIdentifiers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getRelatedIdentifiers() {
        return relatedIdentifiers;
    }

    public void setRelatedIdentifiers(String relatedIdentifiers) {
        this.relatedIdentifiers = relatedIdentifiers;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", publicationDate=" + publicationDate +
                ", author='" + author + '\'' +
                ", thumbnails='" + thumbnails + '\'' +
                ", categories='" + categories + '\'' +
                ", relatedIdentifiers='" + relatedIdentifiers + '\'' +
                '}';
    }
}
