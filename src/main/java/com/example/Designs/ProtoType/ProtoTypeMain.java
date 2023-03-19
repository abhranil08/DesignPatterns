package com.example.Designs.ProtoType;

public class ProtoTypeMain{
    public static void main(String args[])
    {
        ProfessionCache.loadProfessionCache();

        Profession teacher = ProfessionCache.getCloneNewProfession("teacher");
        Profession engineer = ProfessionCache.getCloneNewProfession("engineer");
        Profession teacher1 = ProfessionCache.getCloneNewProfession("teacher");
        Profession engineer1 = ProfessionCache.getCloneNewProfession("engineer");

        System.out.println("Object teacher : " + teacher );
        System.out.println("Object engineer : " + engineer );
        System.out.println("Object teacher1 : " + teacher1 );
        System.out.println("Object engineer1 : " + engineer1 );

        if( teacher != teacher1)
        {
            System.out.println("Objects are not same : not pointing to the same location in Heap");
        }
    }
}