
package com.lxtech.tbrelics.controller;


import com.lxtech.tbrelics.dataacquisition.FileErgodic;
import com.lxtech.tbrelics.dataacquisition.ReadProperties;
import com.lxtech.tbrelics.service.DResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DResourceService dResourceService;

    /**
     * 测试批量插入
     * @throws Exception
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @RequestMapping("insertDResource")
    public void insertDResource() throws Exception ,InterruptedException, ExecutionException {
        ReadProperties rp = new ReadProperties();
        //文件夹必须为硬盘根路径,测试路径可以更改
        String path = rp.getPropertiesString("imgPath", "application.properties");
        long start = System.currentTimeMillis();
        FileErgodic fileErgodic = new FileErgodic();
        List<File> fileList = fileErgodic.getFileDirectory(path);
        List<Future<String>> lstFuture = new ArrayList<>();// 存放所有的线程，用于获取结果
        if(fileList!=null){
            for(File file:fileList){
                while (true) {
                    try {
                        // 线程池超过最大线程数时，会抛出TaskRejectedException，则等待1s，直到不抛出异常为止
                        Future<String> stringFuture = dResourceService.insertDResource(file);
                        lstFuture.add(stringFuture);
                        break;
                    } catch (TaskRejectedException e) {
                        System.out.println("线程池满，等待1S。");
                        Thread.sleep(1000);
                    }
                }
            }
            // 获取值.get是阻塞式，等待当前线程完成才返回值
            for (Future<String> future : lstFuture) {
                future.get();
                //System.out.println(future.get());
            }
            long end = System.currentTimeMillis();
            System.out.println("批量插入执行时间"+(end-start)/1000+"s");
        }

    }

    /**
     * 测试批量插入，10000条数据写入一个json
     * @throws Exception
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @RequestMapping("insertImg")
    public void insertImg() throws Exception ,InterruptedException, ExecutionException {
        ReadProperties rp = new ReadProperties();
        String path = rp.getPropertiesString("imgPath", "application.properties");
        long start = System.currentTimeMillis();
        List<File> fileList = FileErgodic.getFileList(path);
        List<Future<String>> lstFuture = new ArrayList<>();// 存放所有的线程，用于获取结果
        if(fileList!=null){
            while (true) {
                try {
                    // 线程池超过最大线程数时，会抛出TaskRejectedException，则等待1s，直到不抛出异常为止
                    Future<String> stringFuture =  dResourceService.insert(fileList);
                    lstFuture.add(stringFuture);
                    break;
                } catch (TaskRejectedException e) {
                    System.out.println("线程池满，等待1S。");
                    Thread.sleep(1000);
                }
            }
            // 获取值.get是阻塞式，等待当前线程完成才返回值
            for (Future<String> future : lstFuture) {
                future.get();
            }
            long end = System.currentTimeMillis();
            System.out.println("批量插入执行时间"+(end-start)/1000+"s");
        }
    }
}


