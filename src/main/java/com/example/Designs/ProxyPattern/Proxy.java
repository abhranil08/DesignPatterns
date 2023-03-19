package com.example.Designs.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class Proxy extends RealInternet{

    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception
    {
        System.out.println("Authenticating..");

        if( bannedSites.contains(serverHost))
        {
            throw new Exception("banned");
        }
        else
        {
            //Proper authentication and security check
            System.out.println("Authenticated -> Calling real method");
            super.connectTo(serverHost);
        }
    }  
}
