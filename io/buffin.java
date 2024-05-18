package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class buffin {
    public static void main(String[] args) {
        try {
            FileInputStream newFileInputStream = new FileInputStream("D:\\threading_java\\io\\chandan.txt");
            BufferedInputStream newbBufferedInputStream = new BufferedInputStream(newFileInputStream);

            int i = 0;
            while ((i = newbBufferedInputStream.read()) != -1) {
                System.out.print((char)i);
                
            }

            newFileInputStream.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
