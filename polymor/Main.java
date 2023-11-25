package coreJava.polymor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing");

        Student s1 = new Student();
        s1.read("math");  //this is the example of  overloading
// also known as compile time polymorphism



        Person p1 = new Emp();
        p1.showDetail(); //according to this object
        // this is the example of overriding
        //also known as runtime polymorphism.
        //we decide which to execute while running the program
        //for this to happen we need parent class and child class
    }
}


