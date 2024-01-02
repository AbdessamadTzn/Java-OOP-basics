**Interface** is a contract between you and the developer, it specifies the behavior for other classes.
So, when a class implement an interface, it must adhere to the contract.
In brief, interface cannot be instantiated, and all the methods in an interface must be written elswhere, in any class implementing it.
In java:

- The `syntax` of interface definition:

```java
public interface InterfaceName
{
    (method headers...)
}
```

- To `implement` the interface:

```java
public className implements InterfaceName
```

So, we can conclude from the syntax, that all interface's methods are **abstract methods**, from where we got the definition of interface I wrote at first!
In the example, for the code, let's suppose that we have a retailitems's store like CDs and Books, if we sell 'em, probably there is some propreties that are common between those items, and we must include it in all of them, so to be sure that it'll be done, we can use **interface**, and define the proprety that we wanna implement in all of the items (_class_), the same way as abstract classes! for example, in the interface, you give the header of method calculating price of items, and it's for the developer to give it its definition based on each item situation (price/one, promotions, TVA, ect...) but the bottom line, the method of calculation the totl price of item must be there.

- If you implement an interface in a class, and you didn't implement all of its methods you'll get an error.
- A class can implements more the one interface! Just be sure you implement all of the mehods in the implemented interfaces! Look up for _multiple interfaces implementation in java_
- In the main file, r1 have the reference of realitems interface, and point to book class that implement the interface, correct syntax!
- But, if the interface, just have 2 methods, and you add a third method in the class book, that doesn't exist in the interface, with the syntax I'm using in main, reference the interface and point to the class, you'll not be able to call the third method with the r1 object, cz you reference the interface. Look up for _java interface reference_ for more infos!
- Also, ih the case you'are implementing more than one interface, with this syntax you can't call methods that exists in other interface using object r1.
- Is interfaces have fields? Yes! but they are static and final, as follow:

```java
public interface fields{
    int Field1 = 2, Fields2 = 4; //Static nd finals
    (methods headers....)
}
```

- So, the classes inplementing this inetrface can use those fields without modifying 'em!

# By: **[Abdessamad Touzani](https://www.linkedin.com/in/abdessamadtouzani/)**

**Keep It Real**
