package com.tutorial;


import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();//duplicate not allowed and not maintain isertio  order
               //same with the linked hash set but only insertion oreder is maintained
                hs.add("sita");
                hs.add("Gita");
                hs.add("Asha");
                hs.add("Asha");
                System.out.println(hs);

                for(Object oj:hs)
                {
                    System.out.println(oj);
                }

        HashSet<Employee> he=new HashSet<Employee>();
        Employee e1=new Employee(1,"aa",20,20000);
        Employee e2=new Employee(2,"cc",25,25000);

        he.add(e1);
        he.add(e2);

        for(Employee oj:he)
        {
            System.out.println(oj.getId()+"\t"+oj.getName()+"\t"+oj.getAge()+"\t"+oj.getSalary());
        }



    }
}
