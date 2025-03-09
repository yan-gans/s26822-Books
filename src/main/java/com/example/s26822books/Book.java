package com.example.s26822books;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToMany
    private List<Author> authors;
    @ManyToOne
    private Publisher publisher;
    private double price;


    public Book() {
    }

    public Book(Long id, String title, List<Author> author, Publisher publisher, double price) {
        this.id = id;
        this.title = title;
        this.authors = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void setAuthor(List<Author> author) {
        this.authors = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public List<Author> getAuthor() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}