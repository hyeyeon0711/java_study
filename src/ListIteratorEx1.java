package src;

import java.util.*;

public class ListIteratorEx1 {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        //순방향으로 읽어옴
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        //역방향으로 읽어옴
        while(it.hasPrevious()) {
            System.out.print(it.previous());
        }
        System.out.println();
    }
}
//  Iterator 는 단방향으로만 이동 가능
//  ListIterator 는 양방향으로 이동 가능