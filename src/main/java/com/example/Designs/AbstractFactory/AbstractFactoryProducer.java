package com.example.Designs.AbstractFactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession( boolean isTrainee )
    {
        if( isTrainee )
        {
            return new TraineeProfessionAbstractFactory();
        }
        else
        {
            return new ProfessionAbstractFactory();
        }
    }
    
}
