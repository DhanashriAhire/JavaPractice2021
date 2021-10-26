package com.tutorial;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> hm = new LinkedHashMap<String, String>();
        hm.put("id", "11");
        hm.put("name", "dhanashri");
        hm.put("age", "20");
        System.out.println(hm);
        System.out.println(hm.get("name"));

        Set<String> keyset = hm.keySet();
      for(String k:keyset)
      {
          System.out.println(k+"\t"+hm.get(k));
      }

    }
}