package com.lxtech.tbrelics.dataacquisition;

import java.util.HashMap;
import java.util.Map;

/**
 * 图片大小与标志位返回  K\KB\MB  1：5M、2：5M-50M 3:50M-200M 4.200M以上
 * 图片分辨率与标志位返回    //分辨率 1.10万以下 2.10万-100万 3.100万-500万 4.500万-2000万 5.2000万以上
 */

public class ImgSizeResolutionRatio {
    public static Map<String,String>  getPrintSize(long size) {
        Map<String,String> map = new HashMap<>();
        //如果字节数少于1024，则直接以B为单位，否则先除于1024，后3位因太少无意义
        if (size < 1024) {
            map.put("imgSize",String.valueOf(size) + "B");
            map.put("imgSizeFlag","1");
            return map;
        } else {
            size = size / 1024;
        }
        //如果原字节数除于1024之后，少于1024，则可以直接以KB作为单位
        //因为还没有到达要使用另一个单位的时候
        //接下去以此类推
        if (size < 1024) {
            map.put("imgSize",String.valueOf(size) + "KB");
            map.put("imgSizeFlag","1");
            return map;
        } else {
            size = size / 1024;
        }
            //因为如果以MB为单位的话，要保留最后1位小数，
            //因此，把此数乘以100之后再取余
        if(size<=5){
            map.put("imgSizeFlag","1");
        }
        if(size>5&&size<=50){
            map.put("imgSizeFlag","2");
        }
        if(size>50&&size<=200){
            map.put("imgSizeFlag","3");
        }
        if(size>200){
            map.put("imgSizeFlag","4");
        }
            size = size * 100;
        String imgSize = String.valueOf((size / 100)) + "."
                + String.valueOf((size % 100)) + "MB";
        map.put("imgSize",imgSize);
            return map;
    }

    //分辨率 1.10万以下 2.10万-100万 3.100万-500万 4.500万-2000万 5.2000万以上
    public static Map<String,String>  getPrintWH(long width,long height) {
        Map<String,String> map = new HashMap<>();
        long resolutionRatio = width*height/10000;
        if(resolutionRatio<=10){
            map.put("resolutionRatioFlag","1");
        }
        if(resolutionRatio>10&&resolutionRatio<=100){
            map.put("resolutionRatioFlag","2");
        }
        if(resolutionRatio>100&&resolutionRatio<=500){
            map.put("resolutionRatioFlag","3");
        }
        if(resolutionRatio>500&&resolutionRatio<=2000){
            map.put("resolutionRatioFlag","4");
        }
        if(resolutionRatio>2000){
            map.put("resolutionRatioFlag","5");
        }
        map.put("resolutionRatio", String.valueOf(width)+"X"+String.valueOf(height));
        return  map;
    }

    public static boolean  imgFormate(String formate){
        if(formate.equals("jpg")||formate.equals("png")||formate.equals("gif")||formate.equals("tif")||formate.equals("raw")||formate.equals("svg")||formate.equals("webp")||formate.equals("bmp")){
           return  true;
        }else {
            return false;
        }
    }
}
