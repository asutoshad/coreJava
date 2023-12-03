package coreJava.generic;

public class Example {
    public static void main(String[] args) {

        Box<String> box = new Box<String>("This is awesome");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<Integer>(2255);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());
    }
}
