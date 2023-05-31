package src.generic;

import src.InteratorEx1;

import java.util.*;

public class HashMapEx2 {
    public static void main(String args[]) {
        HashMap map = new HashMap();
        map.put("홍길동", new Integer(70));
        map.put("고길동", new Integer(100));
        map.put("박둘리", new Integer(80));
        map.put("강또치", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
