package com.example.Designs.Builder;

public class EarthQuakeBuilder implements Builder {
    private Home earthquakeHome = new Home();

    @Override
    public void buildFloor()
    {
        this.earthquakeHome.floor = "Wooden Floor";
    }

    @Override
    public void buildTerrace()
    {
        this.earthquakeHome.terrace = "Wooden Terrace";
    }

    @Override
    public void buildWall()
    {
        this.earthquakeHome.walls = "Wooden Walls";
    }

    @Override
    public Home buildHome()
    {
        return this.earthquakeHome;
    }
    
}
