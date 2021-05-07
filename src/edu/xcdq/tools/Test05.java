package edu.xcdq.tools;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test05 {
    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);  // 按照字母顺序排
            }
        });

        tree.put("name", "Jack");
        tree.put("age", "22");
        tree.put("high", "173");
        tree.put("sex", "man");
        tree.put("weigtht", "70KG");
        tree.put("aaa", "70KG");
        tree.put("aba", "70KG");

        for (Map.Entry<String, String> entry : tree.entrySet()) {
            System.out.println( entry );
        }









    }
}
