package com.urlshortner.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "urlshort")
public class Url {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    private String originalUrl;
    private String shortLink;
    private LocalDateTime creationDate;
    private LocalDateTime expirationDate;
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public String getShortLink() {
		return shortLink;
	}
	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Url(int id, String originalUrl, String shortLink, LocalDateTime creationDate, LocalDateTime expirationDate) {
		super();
		this.id = id;
		this.originalUrl = originalUrl;
		this.shortLink = shortLink;
		this.creationDate = creationDate;
		this.expirationDate = expirationDate;
	}
	public Url() {
		super();
	
	}

    
    
}
