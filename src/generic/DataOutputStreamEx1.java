package src.generic;

import java.io.*;

public class DataOutputStreamEx1 {
    public static void main(String args[]) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("/Users/khy/Desktop/sample.txt");
            dos = new DataOutputStream(fos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            dos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
