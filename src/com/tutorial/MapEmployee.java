package com.tutorial;

import java.util.HashMap;
import java.util.Map;

public class MapEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee(11,"aa",20,20000);
        Employee e2=new Employee(22,"cc",25,25000);

        HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
            emp.put(101,e1);
            emp.put(102,e2);

            System.out.println(emp);

            for(Map.Entry<Integer,Employee>oj: emp.entrySet())
            {
                System.out.println(oj.getKey()+"\t"+oj.getValue().getName()+"\t"+oj.getValue().getAge());
            }

    }
}
