package coreJava.generic;

public class Box <T>{

    T container;
    public Box(T container){
        this.container = container;
    }

    public Object getValue(){
        return this.container;
    }
}
