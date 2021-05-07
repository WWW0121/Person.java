package edu.xcdq.tools;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        /*map.put("1" , "haha");
        map.put("2" , "hehe");
        map.put("3" , "heihei");*/
        for (int i = 0; i < 10000000; i++) {
            map.put( (i) , ("haha" + i) ) ;
        }

        /*for(Map.Entry<Integer, String> e: map.entrySet() ) {
            System.out.println(e);
        }*/

        // 迭代器访问map，优点：占用内存小，速读快，能够较大的map
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext() ) {
            Map.Entry<Integer, String> e = iterator.next();
            System.out.println(e);
        }


       /* // 取出所有的键的值作为一个集合
        ArrayList<String> strings = new ArrayList<>(map.keySet());
        for ( String s : strings ) {
            System.out.print(s +"\t");
        }

        // 取出所有的值，把值放在一个list中  new ArrayList<>(接收一个集合)
        ArrayList<String> strlist = new ArrayList<>(map.values());
        for (int i = 0 ; i < strlist.size() ; i ++ ) {
            System.out.println(strlist.get(i));
        }

        for ( String s : strlist ) {
            System.out.println(s);
        }*/




    }
}
