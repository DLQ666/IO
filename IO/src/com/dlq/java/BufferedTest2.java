package com.dlq.java;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 *@program: Java_IO
 *@description:
 *@author: Hasee
 *@create: 2021-01-04 18:16
 */
public class BufferedTest2 {

    @Test
    public void test() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello3.txt")));

//            char[] cbuff = new char[1024];
//            int len;
//            while ((len = bf.read(cbuff)) != -1) {
//                bw.write(cbuff, 0, len);
//            }
            String len;
            while ((len = br.readLine()) != null){
//                bw.write(len+"\n");
                bw.write(len);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
