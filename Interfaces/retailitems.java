package Interfaces;

public interface retailitems {
    // Here, you don't write to key word abstarct, cz we're in an interface, so all methods are abstract methods
    public void setPrice(double price);
    public double getPrice();
    public void setTitle(String title);

    public String getTitle();

    public void setAuthor(String author);

    public String getAuthor();


}
