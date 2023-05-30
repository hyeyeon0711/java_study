package src;

import java.util.ArrayList;

public class ForEachEx2 {
    public static void main(String args[]) {
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("khy");
        userList.add("psj");
        userList.add("psm");
        userList.add("ljw");

        for(String user: userList) {
            System.out.println(user);
        }
    }
}
