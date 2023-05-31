package src.generic;

import java.io.*;

public class FileViewer {
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("/Users/khy/Desktop/tt.txt");
        int data = 0;

        while((data=fis.read())!= -1) {
            char c = (char)data;
            System.out.print(c);
        }
    }
}
