package io;

import java.io.FileOutputStream;

public class out {
    public static void main(String[] args) {
        try {
            FileOutputStream newfFileOutputStream = new FileOutputStream("D:\\threading_java\\io\\chandan.txt");
            String name = "package io;\r\n" + //
                    "\r\n" + //
                    "import java.io.FileOutputStream;\r\n" + //
                    "\r\n" + //
                    "public class out {\r\n" + //
                    "    public static void main(String[] args) {\r\n" + //
                    "        try {\r\n" + //
                    "            FileOutputStream newfFileOutputStream = new FileOutputStream(\"D:\\\\threading_java\\\\io\\\\chandan.txt\");\r\n"
                    + //
                    "            String name = \"the name is chandan sharma\";\r\n" + //
                    "\r\n" + //
                    "            byte []na = name.getBytes();//this is will concat the name into the string\r\n" + //
                    "\r\n" + //
                    "            newfFileOutputStream.write(na);\r\n" + //
                    "            newfFileOutputStream.close();\r\n" + //
                    "\r\n" + //
                    "            System.out.println(\"file writing sucess\");\r\n" + //
                    "            \r\n" + //
                    "        } catch (Exception e) {\r\n" + //
                    "          System.out.println(e);\r\n" + //
                    "        }\r\n" + //
                    "    }\r\n" + //
                    "}";

            byte[] na = name.getBytes();// this is will concat the name into the string

            newfFileOutputStream.write(na);
            newfFileOutputStream.close();

            System.out.println("file writing sucess");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
