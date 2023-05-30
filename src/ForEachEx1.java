package src;

import java.util.Arrays;
import java.util.ArrayList;

public class ForEachEx1 {
    public static void main(String args[]) {

//        String[] numbers = {"one", "two", "three"}; //배열
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three")); //arraylist
        for(String num : numbers) {
            System.out.println(num);
        }
    }
}
