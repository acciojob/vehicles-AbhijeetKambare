package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        //mercedes.accelerate(40);
        mercedes.accelerate(-60);

       // Car t1=new Car("maruti",4,4,5,true,"opentop",4);
    }
}