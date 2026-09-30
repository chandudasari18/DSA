/*Problem: Book Information
Create a class named Book with the following instance variables:
bookId
title
author
price
Requirements
Create a default constructor.
Inside the constructor, initialize the following values:
Book ID: 101
Title: "Java Programming"
Author: "James Gosling"
Price: 650
Create a display() method to print all book details.
Create one object and display the information.
Expected Output
Book ID : 101
Title   : Java Programming
Author  : James Gosling
Price   : 650
*/



package OOPS;

public class BookInformation {
    int bookId;
    String title;
    String author;
    double price;

    public BookInformation() {
        bookId = 101;
        title = "Java Programming";
        author = "James Gosling";
        price = 650;
    }
    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
    }

    public static void main(String[] args) {
        BookInformation book = new BookInformation();
        book.display();
    }
}