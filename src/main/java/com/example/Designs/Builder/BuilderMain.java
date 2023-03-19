package com.example.Designs.Builder;

public class BuilderMain {
    public static void main(String args[])
    {
        // EarthQuakeBuilder object
        EarthQuakeBuilder earthQuakeBuilder = new EarthQuakeBuilder();
        Director director1 = new Director(earthQuakeBuilder);
        director1.manageConstruction();
        Home home1 = director1.getHome();

        System.out.println(home1);
        System.out.println(home1.floor);

        // FloodBuilder object
        FloodBuilder floodBuilder = new FloodBuilder();
        Director director2 = new Director(floodBuilder);
        director2.manageConstruction();
        Home home2 = director2.getHome();

        System.out.println(home2);
        System.out.println(home2.floor);

    }
}
