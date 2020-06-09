package com.lxtech.tbrelics.util;


import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;

import com.lxtech.tbrelics.dataacquisition.TiffOP;
import net.coobird.thumbnailator.Thumbnails;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Test {
    public static String addBlank(String str){
        String[] strs = str.split("");
        String newStr = "newStr";
        for(int i=0;i<strs.length;i++){
            // 用char包装类中的判断数字的方法判断每一个字符
            if(Character.isDigit(str.charAt(i))){
                newStr=str.substring(/**/0,i).toUpperCase()+" "+str.substring(i);//转成大写
                return newStr;
            }

        }
        return newStr;
    }

    public static boolean isBlank(String str){
        boolean flag = false;
        if(str==null || "".equals(str)){
            flag = true;
        }
        return flag;
    }

}
