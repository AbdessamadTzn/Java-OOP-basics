package Interfaces;

public class Main {
    public static void main(String[] args) {
        retailitems r1 = new book();
        r1.setTitle("The 7 Habits of Highly Effective People");
        r1.setAuthor("Stephen R. Covey");
        r1.setPrice(67.8);
        System.out.println("Title: "+r1.getTitle()+"\nAuthor: "+r1.getAuthor()+"\nPrice: "+r1.getPrice());
    }
    
}
