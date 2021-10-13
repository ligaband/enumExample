package entity;


import types.Genre;

import java.util.ArrayList;

public class Book {

    private String title;
    private  int price;
    private ArrayList<Author> authors;
    private Genre genre;
    private int yearOfRelease;


    public Book(String title, int price, int yearOfRelease, String authorLists, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = new ArrayList<>();
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public Genre getGenre() {
        return genre;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
}
