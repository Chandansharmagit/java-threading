package io;

import java.io.FileInputStream;

import multi.chandan;

public class in {
    public static void main(String[] args) {
        try {
           FileInputStream newfFileInputStream = new FileInputStream("D:\\threading_java\\main_thread.java");
           int i = 0;
           while ((i = newfFileInputStream.read()) != -1 ) {
            System.out.print((char)i);
            
           }

           

           //making the connection close
           newfFileInputStream.close();

           System.out.println("file read sucess");
           

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
