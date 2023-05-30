package src.generic;

import java.io.*;

public class FileCopy {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("/Users/khy/Desktop/tt.txt");
            FileOutputStream fos = new FileOutputStream("/Users/khy/Desktop/copy.txt");

            int data = 0;
            while((data=fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
