package com.tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("akshu");
        list.add("cc");
        list.add("dd");

        System.out.println(list.size());//print no of objects in list i.e.3
        System.out.println(list.get(1));//it will prit idex 1 ie. cc
         //usig for
        for(Object obj:list)
        {
            System.out.println(obj);
        }
        //udsig iterator
        Iterator<String> itr= list.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
           //usig employee pojo class

        ArrayList<Employee> e=new ArrayList<Employee>();
           Employee e1=new Employee(1,"aa",20,20000);
           Employee e2=new Employee(2,"cc",25,25000);

           e.add(e1);
           e.add(e2);

           for(Employee oj:e)
           {
               System.out.println(oj.getId()+"\t"+oj.getName()+"\t"+oj.getAge()+"\t"+oj.getSalary());
           }
           System.out.println(e);
           System.out.println(e.size());


    }
}