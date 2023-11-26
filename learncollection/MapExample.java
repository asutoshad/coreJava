package coreJava.learncollection;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> courses = new HashMap<>();

        //adding element
        courses.put("core java", 4000);
        courses.put("Basic python", 3500);
        courses.put("Spring", 8000);
        courses.put("Android",4000);
        courses.put("Android",6000);
        System.out.println(courses);
    }
}
