package coreJava.polymor;

public class Student {

    public void read(){
        System.out.println("Student is reading xyz book");
    }

    public void read(String book){
        System.out.println("Reading " + book + " book");
    }
}
//this is the example of  overloading
// also known as compile time polymorphism