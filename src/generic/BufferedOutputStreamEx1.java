package src.generic;

import java.io.*;

class BufferedOutputStreamEx1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/khy/Desktop/tt.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i='1'; i<= '9'; i++) {
                bos.write(i);
            }
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
