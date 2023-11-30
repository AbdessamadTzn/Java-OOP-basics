# Java-OOP-basics
Learn the basics of Java OOP 
**The bottom line of inheritance is: REUSABILITY**

- When an instance of the subclass is created, the non-private methods of the superclass are available through the subclass object.
- Constructors are not inheritance!!! You can just call it!
- The "super" keyword refers to an object's superclass and is used for calling the superclass explicitly. When a subclass is instantiated, the superclass default constructor is executed first! You can check this by adding this line to the empty constructor `Person.java`:

````java
public Person(){
    System.out.println("I'm the base constructor");
}
````
- In the empty constructor of class `Student.java`:
```java
public Student(){
    System.out.println("I'm the derived class constructor");
}
````
- `main`:
```java
Student student = new Student();
````
- Run the main, and you will see the order of the messages!



