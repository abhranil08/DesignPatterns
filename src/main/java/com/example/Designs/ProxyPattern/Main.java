package com.example.Designs.ProxyPattern;

public class Main {
    public static void main(String args[])
    {
        Internet proxy = new Proxy();
        try
        {
            proxy.connectTo("google.com");
            proxy.connectTo("abc.com");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
