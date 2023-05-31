package src;
import java.util.*;
public class HashSet1 {
    public static void main(String args[]) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i = 0; i<objArr.length; i++) {
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
// 결과 => [1, 1, 2, 3, 4]
// 1이 중복된게 아니라 1과 Integer(1) 이다.



