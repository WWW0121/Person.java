package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author huyuansong
 * @date 2021/5/6 16:29
 */
public class Test01 {
    public static void main(String[] args) {
        String str[] = { "中文", "计算机", "ABC", "123", "qq@qq.com" };

        // 1 Arrays.asList()  把数组转换成list列表
        List<String> strList = Arrays.asList(str);
        for (String string : strList) {
            System.out.print(string +"\t");
        }

        System.out.println();
        // 2 new ArrayList<>(Arrays.asList(str)) 把数组转换成ArrayList，因此就拥有了众多的操作方法
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        LinkedList<String> llist = new LinkedList<>(Arrays.asList(str));
        alist.remove(2);
        // llist.remove(3);
        for (String string : alist) {
            System.out.print(string + "\t");
        }

        // 将列表转换为数组  语法： 列表.toArray()
        Object[] res = alist.toArray();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "\t" );
        }


    }
}
