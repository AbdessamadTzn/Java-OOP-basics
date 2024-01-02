package Interfaces;

public class book implements retailitems {
    String title, Author;
    double price;
    static int count = 0;


    public book() {
        count++;
    }

    public book(String title, String Author, double price) {
        this.title = title;
        this.Author = Author;
        this.price = price;
        count++;
    }

    // You don't need to type the keyword @override, cz we're working by interfaces

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }
    // here we don't need to use override keyword, it's alread an abstract method in the interface
    public int getNumberOfBooks() {
        return count;
    }
    public double getPrice() {
        return count*price;
    }
}
