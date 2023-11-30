package Inheritance;

public class Person {
    private String name, address, nationality;
    private double age;

    public Person() {

    }

    public Person(String name, Double age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Double getAge() {
        return this.age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

}
