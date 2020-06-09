package com.lxtech.tbrelics.dataacquisition;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TiffOP {

    public static void main(String[] args) throws IOException {
       String path = "D:\\data\\2011tlsj\\tif\\QB 2268-1.tif";

        BufferedImage image = readTifFile(path);
        int width = image.getWidth();
        int height = image.getHeight();
        int minX = image.getMinX();
        int minY = image.getMinY();
        int imageSize = width * height;

        System.out.println("图片参数：width="+width+",height="+height);

    }

    //读取tif文件
    public static BufferedImage readTifFile(String path) throws IOException {
        File file = new File(path);
        //读取tif图片
        ImageReader reader = ImageIO.getImageReadersByFormatName("tiff").next();
        FileImageInputStream inputStream = new FileImageInputStream(file);

        reader.setInput(inputStream);
        return reader.read(0);
    }



}
