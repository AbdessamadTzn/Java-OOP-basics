package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> my_list = new ArrayList<String>();
        my_list.add("Abdessamad");
        my_list.add("Catherine");
        my_list.add("Ali");

        System.out.println(my_list.size());
        System.out.println(my_list);
        System.out.println(my_list.get(0));
        
        my_list.add(1, "Julie");
        System.out.println(my_list.get(1));
        System.out.println(my_list);
        System.out.println(my_list.set(1, "Julia"));
        System.out.println(my_list);
        my_list.remove(1);
        System.out.println(my_list.size());
        System.out.println(my_list);
    }

}
