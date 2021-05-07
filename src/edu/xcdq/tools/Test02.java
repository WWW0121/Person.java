package edu.xcdq.tools;

import java.util.Arrays;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        String [] str = new String[] { "中文", "计算机", "ABC", "123", "qq@qq.com" ,"中文"};
        // 将数组先转为list ,再把list转为set
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        for(String s : set ) {
            System.out.println(s);
        }
        // 将set转为数组 集合.toArray()
        Object[] objects = set.toArray();
        for ( int i= 0 ; i < objects.length ; i ++) {
            System.out.print(objects[i] +"\t ");
        }
        System.out.println();
        for ( Object o : objects ) {
            System.out.print(o +"\t ");
        }





    }
}
