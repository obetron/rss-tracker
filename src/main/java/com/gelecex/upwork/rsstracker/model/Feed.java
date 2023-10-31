package com.gelecex.upwork.rsstracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author obetron
 * @date 28.10.2023 - 19:46
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "rss_feed")
public class Feed extends BaseEntity {

    private String title;
    private String link;
    private String description;
    @Column(name = "publication_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime publicationDate;
    private String author;
    private String thumbnails;
    private String categories;
    @Column(name = "related_identifiers")
    private String relatedIdentifiers;

}
