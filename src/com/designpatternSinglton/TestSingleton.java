package com.designpatternSinglton;

public class TestSingleton {
    public static void main(String[] args) {


        //if we create usig new keyword it will create two oj
        //Singleton oj1=new Singleton();
        // Singleton oj2=new Singleton();


        //Using Singleton obj....  it will  return same obj but if we create using new obj it will return diffobj
        //using singleton it will create only obj in memory pool using same reference
        Singleton oj1 = Singleton.getOj1();
        Singleton oj2 = Singleton.getOj1();

        if(oj1==oj2)
        {
            System.out.println("Same oj");

        }
        else{
            System.out.println("diff oject");
        }

    }
}
