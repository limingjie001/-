package com.itheima.test_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        HashMap<String,String> m1 = new HashMap();
        m1.put("001", "zhangsan");
        m1.put("002", "lisi");
        m1.forEach((key,value)->{
            System.out.println(key+"---"+value);
        });



        Iterator<Map.Entry<String, String>> entryIterator = m1.entrySet().iterator();
        while (entryIterator.hasNext()){
           Map.Entry<String, String> entry = entryIterator.next();
           System.out.println(entry.getKey()+"---"+entry.getValue());
       }

    }
}

