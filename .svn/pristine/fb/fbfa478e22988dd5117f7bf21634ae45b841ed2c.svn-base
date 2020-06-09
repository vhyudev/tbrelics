package com.lxtech.tbrelics.dataacquisition;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件遍历、获取文件基本信息
 */
public class FileErgodic {

    private List<File> fileDirectoryList;//文件目录
    public static List<File> imgList = new ArrayList<File>();

    public static List<File> getFileList(String path) {
        // 获得指定文件对象
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            // 获得该文件夹内的所有文件
            File[] array = file.listFiles();
            if(array!=null) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i].isFile()) {// 如果是文件
                        //String fileName = array[i].getPath();
                        imgList.add(array[i]);
                    } else if (array[i].isDirectory()) {// 如果是文件夹
                        getFileList(array[i].getPath());
                    }
                }
            }
        }
        return imgList;
    }

    //遍历文件夹下文件目录
    public List<File> getFileDirectory(String path){
        fileDirectoryList = new ArrayList<>();
        File file = new File(path);		//获取其file对象
        if(!file.exists()){
            System.out.println("文件不存在");
            return null;
        }
        func(file);
        return fileDirectoryList;
    }


    public  List<File> getFiles(File file){//文件目录
        List<File> filesList = new ArrayList<>();
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isFile()) filesList.add(f);
        }
        return filesList;
    }

    private  void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory()){
                fileDirectoryList.add(f);
                func(f);
            }
        }
    }

    public static Map<String,String> findUrlNameIdentifier(String path,String name){
        Map<String,String> map = new HashMap<>();
        String format = path.substring(path.lastIndexOf(".")+1,path.length()).toLowerCase();
        String address =path.substring(3);
        String identifier=name.split("-")[0];
        map.put("format",format);
        map.put("address", address.replaceAll("\\\\","/"));
        map.put("identifier", identifier);
        map.put("name", name.substring(0,name.lastIndexOf(".")));
        return map;
    }


    public static void main(String[] args) {
        String path = "D:\\data"; //文件夹必须为硬盘根路径
        FileErgodic fileErgodic = new FileErgodic();
        List<File> fileList = fileErgodic.getFileDirectory(path);
        for(File file:fileList){
            System.out.println(fileErgodic.getFiles(file));
        }
    }
}
