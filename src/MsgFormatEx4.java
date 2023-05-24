package src;

import java.text.*;
import java.util.*;
import java.io.*;

public class MsgFormatEx4 {
    public static void main(String args[]) throws Exception {
        String table = "CUST_INFO";
        String file = "data4.txt";
        String msg = "INSERT INTO " + table + "VALUES ({0},{1},{2},{3})";

        Scanner sc = new Scanner(new File(file));

        String pattern = "{0},{1},{2},{3}";
        MessageFormat mf = new MessageFormat(pattern);

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }
        sc.close();
    }
}
