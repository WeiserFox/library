package ru.koni.ludi.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class Book{
    private int id;
    private int owner_id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String book_name;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100 characters")
    private String author_name;

    @Min(value = 0, message = "Year should be greater than 0")
    private int year;

    public Book() {

    }

    public Book(int id, String book_name, String author_name, int year, int owner_id) {
        this.id = id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.owner_id = owner_id;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return book_name;
    }

    public void setBookName(String name) {
        this.book_name = name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void setAuthorName(String name) {
        this.author_name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }
}