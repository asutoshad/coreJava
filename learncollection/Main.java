package coreJava.learncollection;

//import java.util package all classes
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection");

        //type safe collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("aashutosh");
        names.add("adhikari");
        names.add("lamjung");
        names.add("kathmandu");
        names.add("adhikari");
//        System.out.println(names);
//        System.out.println(names.get(1));
        for (String  str : names){
            System.out.print(str + "\t" + str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

//        names.remove("kathmandu");
//        System.out.println(names);
//        names.remove(1);
//        System.out.println(names);
//        System.out.println("size = "+names.size());
//        System.out.println(names.contains("aashutosh"));

        //untype safe collection
//        LinkedList list = new LinkedList();
//        list.add("aashish");
//        list.add(22);
//        list.add("44");
//        list.add(33.45);
//        list.add(true);
//        System.out.println(list);
//        System.out.println(list.get(2));
    }
}

/*

creating collection
1. type safe => same type of elements (objects) are added in collection.
2. untype safe(nusafe) => different types of elements can be added in collection.
 */
