package com.gelecex.upwork.rsstracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author obetron
 * @date 28.10.2023 - 15:18
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "rss_tracker")
public class RssTracker extends BaseEntity {

}
