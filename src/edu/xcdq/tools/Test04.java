package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(2);
        nums.add(0);
        nums.add(-5);
        nums.add(0);
        nums.add(3);
        System.out.println( nums );
        Collections.reverse( nums ); // 集合的反转
        System.out.println( nums);


        Collections.sort( nums );  // 排序方法
        System.out.println( nums );

        Collections.shuffle( nums );  // 混洗方法
        System.out.println( nums );

        System.out.println( Collections.max( nums ));  // 求列表中的最大值
        System.out.println( Collections.min( nums )); // 求列表中的最小值
        Collections.replaceAll(nums, 0 , 1);  // 替换所有符合条件的元素
        System.out.println(nums);
        System.out.println( Collections.frequency(nums, 1)); // 查找元素在列表中出现的次数
        // 先排序，后做二分搜索，查找对应的值在列表中是否出现，返回出现在列表中的位置索引
        Collections.sort(nums);
        System.out.println( Collections.binarySearch(nums, 3 ));  // 二分搜索







    }
}
