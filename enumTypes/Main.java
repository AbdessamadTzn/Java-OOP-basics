package enumTypes;

public class Main {
    public static void main(String[] args)
    {
        Course c1 = Course.Python;
        Course c2 = Course.Python;
        Course c3 = Course.UML;
        

        System.out.println(c1.toString());//output: Python
        System.out.println(c1.ordinal());//output: ordre of value in enum type, remember it's 0 base so output is 1, as Python is 2nd position
        System.out.println(c1.compareTo(c2));//output: 0 --- Consider read documentation of compareTo => output 0, >0 or <0
        System.out.println(c1.compareTo(c3));//output: >0 --- Consider read documentation of compareTo => output 0, >0 or <0
        System.out.println(c3.compareTo(c1));//output: <0 --- Consider read documentation of compareTo => output 0, >0 or <0
        System.out.println(c1.equals(c2));//output: true -- consider reading documentation of equals method in java
        System.out.println(c1.equals(c3));//output: false -- consider reading documentation of equals method in java
    }

}
