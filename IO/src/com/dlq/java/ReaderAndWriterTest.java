package com.dlq.java;


import org.junit.jupiter.api.Test;

import java.io.*;

/**
 *@program: Java_IO
 *@description:
 *@author: Hasee
 *@create: 2021-01-03 20:38
 */
public class ReaderAndWriterTest {

    @Test
    public void test01() {
        FileReader reader = null;
        try {
            File file = new File("hello.txt");
            reader = new FileReader(file);

            int read = reader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] fbuf = new char[5];
            int len;
            while ((len = fr.read(fbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(fbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            fw = new FileWriter(file, false);
            fw.write("aaaaabbbbccc\n".toCharArray());
            fw.write("ddddddddddddddd".toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            File file2 = new File("hello2.txt");

            fr = new FileReader(file);
            fw = new FileWriter(file2);

            char[] crChars = new char[5];
            int len ;
            while ((len = fr.read(crChars))!= -1){
                fw.write(crChars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
