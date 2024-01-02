package Interfaces;

public class cd  {
    String name, type;
    double price;

    public cd() {
    }

    public cd(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    // here we don't need to use override keyword, it's alread an abstract method in the interface
    public double getPrice() {
        return price;
    }

}
