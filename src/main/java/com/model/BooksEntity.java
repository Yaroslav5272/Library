package com.model;

import DAO.BookDAO;

import javax.persistence.*;

@Entity
@Table(name = "books", schema = "bookmanager", catalog = "")
public class BooksEntity{
    private int id;
    private String bookTitle;
    private String bookAutor;
    private int bookPrice;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BOOK_TITLE", nullable = false, length = 255)
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Basic
    @Column(name = "BOOK_AUTOR", nullable = false, length = 255)
    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }

    @Basic
    @Column(name = "BOOK_PRICE", nullable = false)
    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksEntity that = (BooksEntity) o;

        if (id != that.id) return false;
        if (bookPrice != that.bookPrice) return false;
        if (bookTitle != null ? !bookTitle.equals(that.bookTitle) : that.bookTitle != null) return false;
        if (bookAutor != null ? !bookAutor.equals(that.bookAutor) : that.bookAutor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bookTitle != null ? bookTitle.hashCode() : 0);
        result = 31 * result + (bookAutor != null ? bookAutor.hashCode() : 0);
        result = 31 * result + bookPrice;
        return result;
    }

}
