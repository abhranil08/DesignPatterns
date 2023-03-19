package com.example.Designs.Singleton;

public class Singleton {
    private static Singleton singletonInstance = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance(){
        return singletonInstance;
    }

    public void print()
    {
        System.out.println("Object point to: " + singletonInstance);
    }
    
}
