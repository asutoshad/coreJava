package coreJava.overriding;

public class Parent {

    public void parentOverriding(){
        System.out.println("This is parent class that will be overridden");
    }
}

 class Child extends Parent{

    public void parentOverriding() {
        System.out.println("This is child class that will override");
    }
}

//this process is called method overriding.
//for this to happen there should be relation between parent and child class.
