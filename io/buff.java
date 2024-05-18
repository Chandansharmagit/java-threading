package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class buff {
    public static void main(String[] args) {
        try {
            FileOutputStream newfFileOutputStream = new FileOutputStream("D:\\threading_java\\io\\chandan.txt");
            BufferedOutputStream newbBufferedOutputStream = new BufferedOutputStream(newfFileOutputStream);
            String names = "hello deepika im chandan sharma can you please unblock me please";

            byte[] sharma = names.getBytes();

            newbBufferedOutputStream.flush();
            newbBufferedOutputStream.write(sharma);

            newbBufferedOutputStream.close();

            System.out.println("writing the file is sucess");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
