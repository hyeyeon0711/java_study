package src;

import java.util.*;
import java.text.*;

public class DateFormatEx1 {
    public static void main(String args[]) {
        Date today0 = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올해의 D입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이달의 d입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올해의 w입니다.");
        sdf8 = new SimpleDateFormat("오늘은 이달의 W입니다.");
        sdf9 = new SimpleDateFormat("오늘은 이달의 F번째 E요일입니다.");

        System.out.println(sdf1.format(today0));
        System.out.println(sdf2.format(today0));
        System.out.println(sdf3.format(today0));
        System.out.println(sdf4.format(today0));
        System.out.println();
        System.out.println(sdf5.format(today0));
        System.out.println(sdf6.format(today0));
        System.out.println(sdf7.format(today0));
        System.out.println(sdf8.format(today0));
        System.out.println(sdf9.format(today0));
    }
}