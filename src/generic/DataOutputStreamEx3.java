package src.generic;

import java.io.*;

public class DataOutputStreamEx3 {
    public static void main(String args[]) {
        int[] score = {100,90,95,85,50};

        try {
            FileOutputStream fos = new FileOutputStream("score.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i<score.length; i++) {
                dos.writeInt(score[i]);
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//JDK 1.7부터 close() 직접 호출하지 않아도 자동 호출함