package com.example.Designs.ProtoType;

import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<String, Profession> professionMap = new Hashtable<String, Profession>();

    public static Profession getCloneNewProfession(String typeOfProfession)
    {
        Profession cachedProfession = professionMap.get(typeOfProfession);
        return (Profession)cachedProfession.clone();
    }

    public static void loadProfessionCache()
    {
        Teacher teacher = new Teacher();
        professionMap.put("teacher", teacher);

        Engineer engineer = new Engineer();
        professionMap.put("engineer",engineer);
    }
}
