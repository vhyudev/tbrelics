package com.lxtech.tbrelics.test;

import com.lxtech.tbrelics.dataacquisition.*;
import com.lxtech.tbrelics.service.DResourceService;
import com.lxtech.tbrelics.util.ImageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 操作数据库，将DResource存入数据库
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ImgDataSourceTest {

    @Autowired
    private DResourceService dResourceService;

    @Autowired
    private ImageUtil imageUtil;

   /* @Test  //测试批量插入
    public void insertDResource() throws Exception ,InterruptedException, ExecutionException {
        String thumbImgURL = "D:\\data\\2011tlsj";
        File file = new File(thumbImgURL);		//获取其file对象
        imageUtil.func(file);
    }
*/
   /* @Test //测试批量插入
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
*/
   /* }
*/




}
