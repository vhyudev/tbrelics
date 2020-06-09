package com.lxtech.tbrelics.dataacquisition;

import net.sf.json.JSONArray;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DataJson {

    public  void  transformJson(List<DResource> list) throws IOException {
        ReadProperties rp = new ReadProperties();
        String url = rp.getPropertiesString("imgAttribute", "application.properties");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ssSS");//设置日期格式
        creatFolder(url);
        if(list.size()>0){
            String fileName = url+"/"+df.format(new Date())+".json";
            System.out.println("文件生成地址="+fileName);
            JSONArray jsonArray = JSONArray.fromObject(list);//将java对象转换为json对象
            String str = jsonArray.toString();//将json对象转换为字符串
            File file=new File(fileName);
            if(!file.exists()) {//判断文件是否存在，若不存在则新建
                file.createNewFile();
            }
            FileOutputStream fileOutputStream=new FileOutputStream(file);//实例化FileOutputStream
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");//将字符流转换为字节流
            BufferedWriter bufferedWriter= new BufferedWriter(outputStreamWriter);//创建字符缓冲输出流对象
            Tool tool = new Tool();
            String JsonString=tool.stringToJSON(str);//将jsonarrray字符串格式化
            bufferedWriter.write(JsonString);//将格式化的jsonarray字符串写入文件
            bufferedWriter.flush();//清空缓冲区，强制输出数据
            bufferedWriter.close();//关闭输出流
            outputStreamWriter.close();
            fileOutputStream.close();
        }
    }

    public  void  dResourceTransformJson(List<DResource> list,String url) throws IOException {
        ReadProperties rp = new ReadProperties();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ssSS");//设置日期格式
        creatFolder(url);
        if(list.size()>0){
            String fileName = url+"/"+df.format(new Date())+".json";
            System.out.println("文件生成地址="+fileName);
            JSONArray jsonArray = JSONArray.fromObject(list);//将java对象转换为json对象
            String str = jsonArray.toString();//将json对象转换为字符串
            File file=new File(fileName);
            if(!file.exists()) {//判断文件是否存在，若不存在则新建
                file.createNewFile();
            }
            FileOutputStream fileOutputStream=new FileOutputStream(file);//实例化FileOutputStream
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");//将字符流转换为字节流
            BufferedWriter bufferedWriter= new BufferedWriter(outputStreamWriter);//创建字符缓冲输出流对象
            Tool tool = new Tool();
            String JsonString=tool.stringToJSON(str);//将jsonarrray字符串格式化
            bufferedWriter.write(JsonString);//将格式化的jsonarray字符串写入文件
            bufferedWriter.flush();//清空缓冲区，强制输出数据
            bufferedWriter.close();//关闭输出流
            outputStreamWriter.close();
            fileOutputStream.close();
        }
    }

    public void creatFolder(String path) throws IOException {
        File file=new File(path);
        if(!file.exists()) {//判断文件是否存在，若不存在则新建
            file.mkdir();//创建文件夹
        }
    }


}
