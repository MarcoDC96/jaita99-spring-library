package org.learning.springlibrary.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="books")
public class Book {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer id;
    @Column(nullable = false)
    private String title;
    private String authors;
    private String publisher;
    @Column(nullable = false, length = 13)
    private String isbn;
    private Integer year;
    @Lob
    private String synopsis;
    private LocalDateTime createdAt;

    //Costruttori

    //Getter Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    //Metodi
}
