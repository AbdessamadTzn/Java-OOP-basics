An **enum** is a specialized class.
Known as an **enum**, requires declaration and definition like a class.
You are managing a car dealership, and you have limited colors of cars, but the user while choosing the car color, doesn't know what colors are available, so when he's filling out the form, you must as a developer/manager limit the color choices...so like combox, you can, in java, limit color choices by using an enum Type, where you define another type in this case `Color`, and you define also its values, that are constants!
So the `syntax` of declaring an enum type is as follow:

```java
enum typeName {one or more enum constants}
```

`Examaple`:

```java
//definition
enum CarColor{Red, Blue, Silver} //each vlue it's an object of type CarColor
//Declaration
CarColor car_color; //creaate a carColor enum
//Assignment
CarColor car_color = CarColor.Silver;//the car_color variable holds the adress of the CarColor.Silver
```

Like any type; We have some methods we can use, here is some methods, (I will give just the name, better to do you researches aabout each one): `toString`, `ordinal`, `equals`, and `compareTo`

- Remember, enum types are 0 based!
  In example, of this part...we will take an example of a registration form.

# By: **[Abdessamad Touzani](https://www.linkedin.com/in/abdessamadtouzani/)**

**Keep It Real**
