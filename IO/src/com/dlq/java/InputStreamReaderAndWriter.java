package com.dlq.java;

import jdk.nashorn.internal.ir.WhileNode;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 *@program: Java_IO
 *@description:
 *@author: Hasee
 *@create: 2021-01-05 11:10
 */
public class InputStreamReaderAndWriter {

    @Test
    public void test1() throws Exception {

        FileInputStream fis = new FileInputStream("hello.txt");
        FileOutputStream fis2 = new FileOutputStream("hello4.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        OutputStreamWriter osw=new OutputStreamWriter(fis2,"gbk");

        char[] cbuff = new char[20];
        int len;
        while ((len = isr.read(cbuff)) != -1){
            osw.write(cbuff,0,len);
        }

        osw.close();
        isr.close();

    }

}
