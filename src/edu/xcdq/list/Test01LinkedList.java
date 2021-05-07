package edu.xcdq.list;

import java.util.LinkedList;

/**
 * @author huyuansong
 * @date 2021/5/6 10:18
 */
public class Test01LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // 1 add 添加
        list.add(123);
        list.add(346);
        System.out.println(list);
        // 2 修改值
        list.set(1,777);
        System.out.println(list);
        // 3 准备一个新列表
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(666);
        list2.add(999);
        // 3 把新列表整体添加到原有的旧列表之上
        list.addAll(list2);
        System.out.println(list);

        // 4 增强方式 遍历列表
        for (Integer i : list2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        // 5 传统角标方式遍历列表
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) +"\t");
        }

        //	6 删除循环出的对象
        list2.remove(0);
        System.out.println(list2);
        //	list 集合是否有数据  7 isEmpty()是否为空
        if( !list.isEmpty() ) {
            System.out.println("list.size = "+ list.size());
            //	8 清空 list
            list.clear();
        }
        System.out.println("list.size = "+ list.size());


    }


}
