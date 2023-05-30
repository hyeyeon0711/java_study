package src.generic;

import java.io.*;

public class FileReaderEx1 {
    public static void main(String args[]) {
        try {
            String fileName = "test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;

            System.out.println("FileInputStream : ");

            while((data=fis.read()) != -1) {
                System.out.print((char)data);
            }
            System.out.println();
            fis.close();

            System.out.println("FileReader : ");

            while((data=fr.read())!=-1)
                System.out.print((char)data);
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    FileReader 와 달리
//    FileStream 에서는 한글이 깨짐