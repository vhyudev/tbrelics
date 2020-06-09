package com.lxtech.tbrelics.util;
                    import java.io.*;
                    import java.util.Collection;
                    import java.util.Iterator;
                    import java.util.Map;
                    import java.util.concurrent.Future;

                    import com.drew.imaging.ImageMetadataReader;
                    import com.drew.imaging.ImageProcessingException;
                    import com.drew.metadata.Directory;
                    import com.drew.metadata.Metadata;
                    import com.drew.metadata.Tag;
                    import com.drew.metadata.exif.ExifSubIFDDirectory;
                    import com.lxtech.tbrelics.dataacquisition.DResource;
                    import com.lxtech.tbrelics.dataacquisition.ImgSizeResolutionRatio;
                    import org.springframework.scheduling.annotation.Async;
                    import org.springframework.scheduling.annotation.AsyncResult;
                    import org.springframework.stereotype.Component;
                    import org.springframework.stereotype.Service;

@Component
public class GetInfoImg {

    public static void main(String[] args) throws IOException {
        File imgFile = new File("D:\\data\\chuli\\2011tlcbwcqzl\\raw\\53.12.38-3.fff");
        //File imgFile = new File("D:\\data\\2011tlsj\\raw\\53.1.65-1.fff");
        //File imgFile = new File("D:\\data\\2011tlsj\\raw\\IMG_0007.CR2");
        //File imgFile = new File("D:\\data\\2011tlsj\\tif\\QB 2268-1.tif");
      /*  GetImgInfo getImgExif = new  GetImgInfo();
        if(imgFile.exists()){
            long start = System.currentTimeMillis();
            DResource dResource = getImgExif.getImgInfo(imgFile);
            long end = System.currentTimeMillis();
            System.out.println("读取时间"+(end-start)/1000+"s");
            System.out.println(dResource);
        }*/

    }

    @Async("getAsyncExecutor")
    public Future<DResource > getImgInfo(File imgFile) throws IOException {
        DResource dResource = getExif(imgFile);
        if(dResource == null){
            System.out.println("文件："+imgFile+"读取不了EXIF数据");
            return null;
        }
        dResource.setRelicid((long) 1);//文物编号
        String path = imgFile.getPath();
        String address =path.substring(3).replaceAll("\\\\","/");
        dResource.setAddresss(address);//文件地址
        String filename = imgFile.getName();
        dResource.setName(filename.substring(0,filename.lastIndexOf(".")));//文件名称
        String identifier;
        if(path.indexOf("yipu")>0){
            identifier=address.split("/")[2];
        }else{
            identifier=filename.split("-")[0];
        }
        dResource.setImgcomparison(identifier);//文物号
        String format = path.substring(path.lastIndexOf(".")+1,path.length()).toLowerCase();
        dResource.setFormat(format);//格式
        Map<String, String> imgMap = ImgSizeResolutionRatio.getPrintSize(imgFile.length());
        dResource.setImgsize(imgMap.get("imgSize"));//文件大小
        dResource.setImgsizeflag(imgMap.get("imgSizeFlag"));//文件大小标志位
        String w = dResource.getExifimagewidth().split(" pixels")[0];
        String h = dResource.getExifimagelength().split(" pixels")[0];
        long width = Long.parseLong(w);
        long height = Long.parseLong(h);
        Map<String, String> imgResolutionRatioMap = ImgSizeResolutionRatio.getPrintWH(width, height);
        dResource.setResolutionratio(imgResolutionRatioMap.get("resolutionRatio"));//图片分辨率
        dResource.setResolutionratioflag(imgResolutionRatioMap.get("resolutionRatioFlag"));//图片分辨率标志位
        return new AsyncResult<>(dResource);
    }

    public  DResource getExif(File imgFile) throws IOException {
        DResource dResource = new DResource();
        InputStream is =null;
        Metadata metadata = null;
        try {
            is = new FileInputStream(imgFile);
            //核心对象操作对象
            metadata = ImageMetadataReader.readMetadata(is);
            //
            //Directory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    if("Make".equals(tag.getTagName())){
                        dResource.setMake(tag.getDescription());
                    }
                    if("Model".equals(tag.getTagName())){
                        dResource.setModel(tag.getDescription());
                    }
                    if("Orientation".equals(tag.getTagName())){
                        dResource.setOrientation(tag.getDescription());
                    }
                    if("Resolution Unit".equals(tag.getTagName())){
                        dResource.setResolutionunits(tag.getDescription());
                    }
                    if("X Resolution".equals(tag.getTagName())){
                        dResource.setWresolution(tag.getDescription());
                    }
                    if("Y Resolution".equals(tag.getTagName())){
                        dResource.setHresolution(tag.getDescription());
                    }
                    if("Image Width".equals(tag.getTagName())){//图片宽度
                        dResource.setExifimagewidth(tag.getDescription());
                    }
                    if("Image Height".equals(tag.getTagName())){//图片高度
                        dResource.setExifimagelength(tag.getDescription());
                    }
                    if("Software".equals(tag.getTagName())){
                        dResource.setImgsoftware(tag.getDescription());
                    }
                    if("YCbCr Positioning".equals(tag.getTagName())){
                        dResource.setHuelocation(tag.getDescription());
                    }
                    if("Exif Version".equals(tag.getTagName())){
                        dResource.setExifver(tag.getDescription());
                    }
                    if("F-Number".equals(tag.getTagName())){
                        dResource.setFnum(tag.getDescription());
                    }
                    if("ISO Speed Ratings".equals(tag.getTagName())){
                        dResource.setIsospeedratings(tag.getDescription());
                    }
                    if("Exposure Time".equals(tag.getTagName())){
                        dResource.setImgexposuretime(tag.getDescription());
                    }
                    if("Date/Time Original".equals(tag.getTagName())){//拍摄时间
                        dResource.setImgshoottime(tag.getDescription());
                    }
                    if("Date/Time Digitized".equals(tag.getTagName())){
                        dResource.setSavetime(tag.getDescription());
                    }
                    if("Date/Time".equals(tag.getTagName())){
                        dResource.setFinalltime(tag.getDescription());
                    }
                    if("Exposure Bias Value".equals(tag.getTagName())){
                        dResource.setImgexposurevalue(tag.getDescription());
                    }
                    if("Max Aperture Value".equals(tag.getTagName())){
                        dResource.setMaxaval(tag.getDescription());
                    }
                    if("Metering Mode".equals(tag.getTagName())){
                        dResource.setImgmeteringmodel(tag.getDescription());
                    }
                    if("Lightsource".equals(tag.getTagName())){
                        dResource.setLight(tag.getDescription());
                    }
                    if("Flash".equals(tag.getTagName())){
                        dResource.setBulbuse(tag.getDescription());
                    }
                    if("Focal Length".equals(tag.getTagName())){
                        dResource.setFocallen(tag.getDescription());
                    }
                    if("Color Space".equals(tag.getTagName())){
                        dResource.setColorfulspace(tag.getDescription());
                    }
                }
                if (directory.hasErrors()) {
                    for (String error : directory.getErrors()) {
                        System.err.println("ERROR: "+ error);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ImageProcessingException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            //img.getGraphics().dispose();
            is.close();
        }
        return dResource;
    }

}
