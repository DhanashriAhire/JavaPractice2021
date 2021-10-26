package com.tutorial;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList <String>list=new ArrayList<String>();//use<String> when we add only string values
           list.add("aa");
           list.add("cc");
           list.add("dd");
           list.add("dd");
           System.out.println(list);

         ArrayList <Integer>list2=new ArrayList<Integer>();
         list2.add(1);
         list2.add(2);
         list2.add(3);

         System.out.println(list2);
        ArrayList list3=new ArrayList();
        list3.add("aa");
        list3.add(1);
        list3.add(1);
        list3.add(2);
         System.out.println(list3);
//maintain insertion order,allows duplicate values
    }
}
