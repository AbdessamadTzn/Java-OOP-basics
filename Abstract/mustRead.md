The bottom line of **Abstarction** is setting sorta Class template. It represent the **_generic_** or **_abstract_** form of all the classes that are derived from it.

- An abstract class cannot be instantiated, but otehr classes are derived from it.
- An abstract class serves as a super class for other classes.
- A class become abstarct when you place the **abstract** key word in the class definition, as below:

```java
    public abstract class ClassName
```

**Note** that if you use in the class an abstract method, the class becomes automaticaly an abstract class!
_So, what is an abstract method?_

- An _abstract method_ is a method that appears in teh superclass, but expects to be overridden in a subclass.
- An abstract class has no body, you just define it's prototype in the superclass as the `syntax`:

```java
AccessSpecifier abstract ReturnType MethodName(PrameterList);
```

Example for:

`Employee.java`

```java
public abstract double GetSalary();
```

`HourlyEmployee.java`:

```java
@override
public double getSalary() {
    return working_hours * hour_rate;
    }
```

# By: **[Abdessamad Touzani](https://www.linkedin.com/in/abdessamadtouzani/)**
