package com.example.Designs.Builder;

public class FloodBuilder implements Builder{
    private Home FloodHome = new Home();

    @Override
    public void buildFloor()
    {
        this.FloodHome.floor = "Water resistant Floor";
    }

    @Override
    public void buildTerrace()
    {
        this.FloodHome.terrace = "Water resistant Terrace";
    }

    @Override
    public void buildWall()
    {
        this.FloodHome.walls = "Water resistant Walls";
    }

    @Override
    public Home buildHome()
    {
        return this.FloodHome;
    }
    
}
