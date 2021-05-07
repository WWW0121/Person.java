package edu.xcdq.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author huyuansong
 * @date 2021/5/6 15:20
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        // 键值对
        HashMap<String, String> map01 = new HashMap<>();
        map01.put("name" , "翠花");
        map01.put("age" , "18" );
        map01.put("sex" , "男");
        System.out.println(map01);
        for (Map.Entry<String , String > m : map01.entrySet() ) {
            System.out.println(m);
        }

        for (String key : map01.keySet() ) {
            System.out.println(key + "= " + map01.get(key) );
        }

        for (String value : map01.values() ) {
            System.out.println(value + "\t ");
        }




    }
}
