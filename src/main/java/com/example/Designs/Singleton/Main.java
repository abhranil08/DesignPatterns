package com.example.Designs.Singleton;

public class Main {

    public static void main(String args[])
    {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        singleton1.print();
        singleton2.print();

        if( singleton1 == singleton2 )
        {
            System.out.println("Both objects are pointing to the same object in the heap!");
        }

        if( singleton2 == singleton3 )
        {
            System.out.println("All objects are pointing to the same object in the heap!");
        }
    }
}
