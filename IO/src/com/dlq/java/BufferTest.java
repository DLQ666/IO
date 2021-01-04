package com.dlq.java;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 *@program: Java_IO
 *@description:
 *@author: Hasee
 *@create: 2021-01-04 17:26
 */
public class BufferTest {

    @Test
    public void test1() {
        FileInputStream fs = null;
        FileOutputStream fo = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file = new File("图片.jpg");
            File file2 = new File("图片2.jpg");

            fs = new FileInputStream(file);
            fo = new FileOutputStream(file2);

            bis = new BufferedInputStream(fs);
            bos = new BufferedOutputStream(fo);

            byte[] buff = new byte[10];
            int len;
            while ((len = bis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            fs.close();
//            fo.close();
        }
    }
}
