package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test07 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add( new Person(110 ,"Mark") );
        list.add( new Person(101 ,"李四") );
        list.add( new Person(100 ,"张三") );
        list.add( new Person(111 ,"Jack") );

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getUserId() - o2.getUserId() ;
            }
        });
        for (Person p : list) {
            System.out.println( p );
        }

    }
}
