package com.tutorial;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String > te=new TreeSet<String>();//no duplicate allowed & alphabetical order is maintained
        te.add("Asha");
        te.add("Sita");
        te.add("gita");
        te.add("ccd");
        System.out.println(te);


    }
}
