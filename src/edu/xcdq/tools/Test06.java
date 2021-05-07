package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();

        list.add( new User(110 ,"Mark") );
        list.add( new User(101 ,"李四") );
        list.add( new User(100 ,"张三") );
        list.add( new User(111 ,"Jack") );

        Collections.sort(list);
        for (User user : list) {
            System.out.println( user );
        }

    }
}
