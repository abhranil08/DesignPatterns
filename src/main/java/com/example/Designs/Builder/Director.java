package com.example.Designs.Builder;

public class Director {
    Builder builder;

    public Director(Builder builderType)
    {
        this.builder = builderType;
    }

    public Home getHome()
    {
        return this.builder.buildHome();
    }

    public void manageConstruction()
    {
        this.builder.buildFloor();
        this.builder.buildTerrace();
        this.builder.buildWall();
    }
    
}
