package edu.xcdq.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuansong
 * @date 2021/5/6 8:22
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // 数组列表
        //	1 添加数据
        list.add(123);
        list.add(346);
        System.out.println(list);

        //	2 替换数据
        list.set(1, 777);
        System.out.println(list);

        //	将list2中的所有数据放到 list 中  3 addAll()
        List<Integer> list2 = new ArrayList<>();  // 默认给定的长度是10  DEFAULT_CAPACITY = 10
        list2.add(666);
        list2.add(999);
        list.addAll( list2 );
        System.out.println(list);

        //	循环list2中所有的数据
        for (Integer i : list2 ) {
            System.out.println( i );
        }
        //	5 删除循环出的对象
        list2.remove(0);
        System.out.println(list2);

        //	list 集合是否有数据  6 isEmpty()是否为空
        if( !list.isEmpty() ) {
            System.out.println("list.size = "+ list.size());
            //	7 清空 list
            list.clear();
        }
        System.out.println("list.size = "+ list.size());

    }

}
