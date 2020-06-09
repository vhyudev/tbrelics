package com.lxtech.tbrelics.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 将读取不到的图片资源写入文件，后期再进行处理,加入静态同步锁（类锁）
 */
public class AppendContentToFile {
    public synchronized static void method(String file, String conent) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(conent+"\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AppendContentToFile a = new AppendContentToFile();
        a.method("D:\\thumb\\thumb.txt", "D:\\thumb\\thumb\\tif\\big-thumb_GMS 1186-3.jpg");
    }
}
