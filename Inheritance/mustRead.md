**The bottom line of inheritance is: REUSABILITY**

- When an instance of the subclass is created, the non-private methods of the superclass are available through the subclass object.
- Constructors are not inheritance!!! You can just call it!
- The "super" keyword refers to an object's superclass and is used for calling the superclass explicitly. When a subclass is instantiated, the superclass default constructor is executed first! You can check this by adding this line to the empty constructor `Person.java`:

```java
public Person(){
    System.out.println("I'm the base constructor");
}
```

- In the empty constructor of class `Student.java`:

```java
public Student(){
    System.out.println("I'm the derived class constructor");
}
```

- `main`:

```java
Student student = new Student();
```

- Run the main, and you will see the order of the messages!
- **Next**: Overridding...

### Overridding:

- We have a class Employee with 2 sub-classes Salary employee and Hourly employee
- For the salary getter method, in class `Employee`:

```java
getSalary(){
    return salary;
}
```

- For the Hourly employee, the salary is calculated differently than the Salary Employee, and as a result we will have:

For `Salary Employee`:

```java
getSalary(){
    return salary + bonus - deductions;
}
```

For `Hourly Employee`:

```java
getSalary(){
    return working_hours * hour_rate;
}
```

- So, that's what overridding means, you will have the same method with the same signature and parameters, but
  **always** the sub-class's method override the super class's method, depending on the needs.
- Let's now cut to the chase, the syntax of overridding is by including @Override before continue for the process, so:

For `Salary Employee`:

```java
@Override
getSalary(){
    return salary + bonus - deductions;
}
```

For `Hourly Employee`:

```java
@Override
getSalary(){
    return working_hours * hour_rate;
}
```

- And don't forget, to allow the subclass to access an attribute in the super class, it should be public or protected (recomended).

- In the example of Employee, that you see in code's files attached, I worked with multilevel inheritance, so Employee is an instance of Person; Then SalariedEmployee and HourlyEmployee are instances of Employee; **PAY ATTENTION TO CONSTRUCTIONS!**

- Now, if we wanna **prevent** overridding of a method? Just add **final** keyword before it in teh super class.
- This ensure that a subclass will work with the original method rather than a modified version of it!

```java
    public final void message() //This method is in the super class, and it will not be overridding in instances
```

# By: **[Abdessamad Touzani](https://www.linkedin.com/in/abdessamadtouzani/)**
