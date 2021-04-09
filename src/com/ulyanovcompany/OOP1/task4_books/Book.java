package com.ulyanovcompany.OOP1.task4_books;

import java.util.Arrays;
import java.util.StringJoiner;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (Author author: authors) {
            stringJoiner.add(author.getName());
        }
        return stringJoiner.toString();
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name +
                ", authors={" + Arrays.toString(authors).replaceFirst("\\[","") + "}" +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
