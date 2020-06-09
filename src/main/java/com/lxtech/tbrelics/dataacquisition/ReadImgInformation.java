package com.lxtech.tbrelics.dataacquisition;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * 读取图片信息,     注意：文件夹必须是根目录下
 */
public class ReadImgInformation {

    /**
     * 计算图片尺寸大小、分辨率等信息：w宽、h高、s大小。异常时返回null。
     *
     *  获取资源信息
     * @return 图片信息map
     */
    public static Map<String,String> getImgInfo(File imgfile) throws IOException {
        //图片路径、格式、文物号
        Map<String,String>  map =FileErgodic.findUrlNameIdentifier(imgfile.getPath(), imgfile.getName());
        FileInputStream fis = null;
        BufferedImage buff = null;
        try {
            fis = new FileInputStream(imgfile);
            buff = ImageIO.read(imgfile);
            if(buff != null){
                getSize(map,imgfile);//图片大小与标志位
                Long width = buff.getWidth() * 1L;
                Long height = buff.getHeight() * 1L;
                //图片分辨率与标志位
                Map<String, String> imgResolutionRatioMap = ImgSizeResolutionRatio.getPrintWH(width, height);
                long resolutionRatio = width * height;
                map.put("resolutionRatio", imgResolutionRatioMap.get("resolutionRatio"));
                map.put("resolutionRatioFlag", imgResolutionRatioMap.get("resolutionRatioFlag"));
            }else{
                getSize(map,imgfile);//图片大小与标志位
                map.put("resolutionRatio",null);
                map.put("resolutionRatioFlag", "0");
                System.err.println("所给的文件" + imgfile.getPath()+ "读取尺寸大小信息失败！");
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("所给的文件" + imgfile.getPath() + "不存在！");
            return null;
        } catch (NullPointerException e) {
            System.err.println("所给的文件" + imgfile.getPath() + "读取失败！");
            return null;
        }
        return map;
    }

    public  DResource  structureResource(Map map,String identifier){
        DResource dResource = new DResource();
        dResource.setAddresss((String) map.get("address"));
        dResource.setFormat((String) map.get("format"));
        dResource.setImgsize((String) map.get("imgSize"));
        dResource.setImgsizeflag((String) map.get("imgSizeFlag"));
        dResource.setResolutionratio((String) map.get("resolutionRatio"));
        dResource.setResolutionratioflag((String) map.get("resolutionRatioFlag"));
        dResource.setName((String) map.get("name"));
        dResource.setImgcomparison(identifier);
        return dResource;
    }

    //读取tif文件
    private static BufferedImage readTifFile(File file) throws IOException {
        //File file = new File(path);
        //读取tif图片
        ImageReader reader = ImageIO.getImageReadersByFormatName("tiff").next();
        FileImageInputStream inputStream = new FileImageInputStream(file);

        reader.setInput(inputStream);
        return reader.read(0);
    }

    private static void getSize(Map<String,String> map,File imgfile){
        //图片大小与标志位
        Map<String, String> imgMap = ImgSizeResolutionRatio.getPrintSize(imgfile.length());
        map.put("imgSize", imgMap.get("imgSize"));
        map.put("imgSizeFlag", imgMap.get("imgSizeFlag"));
    }

}
