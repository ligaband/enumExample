package controller;

import entity.Author;
import entity.Book;
import types.Genre;

import java.util.ArrayList;

public class BookService {

    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
//Task: return list of books by Fantasy type.

    public ArrayList<Book> findFantasy() {
        ArrayList<Book> fantasy = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(Genre.FANTASY)) {
                fantasy.add(book);

            }
        }
        return fantasy;
    }


//Task: return a list of books released before 1999
    public ArrayList<Book> releasedBefore1999(){
        ArrayList<Book> bookBefore1999 = new ArrayList<>();
        for(Book book : books){
            if(book.getYearOfRelease()< 1999){
                bookBefore1999.add(book);
            }

        }
        return bookBefore1999;
    }


    //Task: return a list of book written by provides author.

    //create a method that finds a book by provided author;
    //create a new array list of Books "authorBooks";
    //loop through the books in the book list;
    //if provided author is among the authors of the current book, then add book to the list of authorBooks created;
    //if author belongs to any of the authors in Book.getAuthor;
    //after loop is completed return arraylist of authorBooks;

    public ArrayList<Book> authorBookList(Author authorProvided) {
        ArrayList<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            for (Author author1 : book.getAuthors()) {
                if (authorProvided.equals(author1)) {
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;

    }




// Task: return a book written by 3 authors.

public Book bookByThreeAuthors(){
        for(Book book : books){
            if(book.getAuthors().size() == 3){
                return book;
            }
        }
        return null;
}

    //Task: verify if the book is on the list.

    public Boolean verifyBook(Book book){
        return books.contains(book);
    }


    //Task: return the most expensive book.


    public Book findMostExpensiveBook() {
        Book mostExpensive = books.get(0);
        for (Book book : books) {

                if (book.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = book;

            }
        }
        return mostExpensive;
    }

    //Task: return cheapest book.

    public Book findCheapestBook()  {
        Book cheapest = books.get(0);
        for (Book book : books) {
            if (book.getPrice() < cheapest.getPrice()) {
                    cheapest = book;
            }
        }
        return cheapest;
    }



}




