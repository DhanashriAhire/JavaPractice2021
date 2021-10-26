package com.designpatternSinglton;

public class Singleton {
    int id = 11;
    float salary = 20000;
    String name = "aaa";
    //EagerLoadig Singleton
    /*
    private  static  Singleton oj=null;
    private Singleton() {
        oj=new Singleton();
    }
    public static Singleton getOj()
    {
        return oj;

    }*/
    //Lazy Loadig sigleton
    private static Singleton oj = null;

    private Singleton() {

    }

    public static Singleton getOj1() {
        if (oj == null)
            oj = new Singleton();
            return oj;
    }
}
