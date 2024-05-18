package io;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class seq {
    public static void main(String[] args) {
        try {
            FileInputStream newfFileInputStream = new FileInputStream("D:\\threading_java\\io\\chandan.txt");
            FileInputStream newfFileInputStream2 = new FileInputStream("D:\\threading_java\\io\\out.java");
            SequenceInputStream newSequenceInputStream = new SequenceInputStream(newfFileInputStream,newfFileInputStream2);

            int i = 0;
            while ((i = newSequenceInputStream.read()) != -1) {
                System.out.print((char)i);
                Thread.sleep(400);
                
            }

            newfFileInputStream.close();
            newfFileInputStream2.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
