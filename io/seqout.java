package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class seqout {
    public static void main(String[] args) {
        try {

            FileOutputStream newpFileOutputStream =  new FileOutputStream("D:\\threading_java\\io\\chandans.txt");
            FileOutputStream newfFileOutputStream2 = new FileOutputStream("D:\\threading_java\\io\\sharma.txt");

            ByteArrayOutputStream newByteArrayOutputStream = new ByteArrayOutputStream();

            newByteArrayOutputStream.write("chanan");

            

            newByteArrayOutputStream.writeTo(newByteArrayOutputStream);
            newByteArrayOutputStream.writeTo(newfFileOutputStream2);
             
            newByteArrayOutputStream.flush();

            newByteArrayOutputStream.close();


            System.out.println("file writing sucess");

            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
