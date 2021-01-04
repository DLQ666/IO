package com.dlq.java;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *@program: Java_IO
 *@description:
 *@author: Hasee
 *@create: 2021-01-04 17:12
 */
public class InputAndOutputStreamTest {

    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("图片.jpg");
            File file2 = new File("图片1.jpg");
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);

            byte[] buff = new byte[5];
            int len;
            while ((len = fis.read(buff)) != -1) {
                fos.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
