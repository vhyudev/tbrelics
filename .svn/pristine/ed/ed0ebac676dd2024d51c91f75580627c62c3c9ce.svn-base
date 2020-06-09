package com.lxtech.tbrelics.util;

import com.lxtech.tbrelics.dataacquisition.FileErgodic;
import com.lxtech.tbrelics.domain.LCollection;
import com.lxtech.tbrelics.domain.LResource;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author RLL
 * @date 2020/5/1
 */

public class Json2db {

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\RLL\\Desktop\\文物图片数据";
        //Json2db.saveJsonToDatabase(path);
        //getRelicId();
        updateRelicThumb();
        //updateRelicData();
    }

    /***
     * 修改EXIF信息
     * @throws Exception
     */
    public static void updateRelicData() throws Exception {
        Long startTime = System.currentTimeMillis();
        System.out.println("开始查询数据");
        List<LResource> list = new ArrayList<LResource>();
        LResource lTmp = null;
        String selectSQL = "select id,addresss from `l_resource`";
        List<LResource> lResourceList1 = DBUtil.executeQueryLResource(selectSQL);
        String selectSQL2 = "select addresss, make, model, orientation, resolutionunits, " +
                "wresolution, hresolution, exifImageWidth, exifImageLength, imgSoftware, " +
                "hueLocation, exifver, fnum, isoSpeedRatings, imgExposureTime, imgShootTime, " +
                "saveTime, finallTime, imgExposureValue, maxAVal, imgMeteringModel, light, " +
                "bulbuse, focallen, colorfulspace from `l_tmp`";
        List<LResource> lResourceList2 = DBUtil.executeQueryLTmp(selectSQL2);
        for(int i=0;i<lResourceList2.size();i++){
            String addresss = lResourceList2.get(i).getAddresss();
            for (LResource lResource: lResourceList1){
                if(addresss.equals(lResource.getAddresss())){
                    lTmp = lResourceList2.get(i);
                    lTmp.setId(lResource.getId());
                    list.add(lTmp);
                    break;
                }
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("组装完毕,用时：" + (endTime - startTime)/1000);
        System.out.println("list.size():"+list.size());

        String sql = "insert into `l_tmp2`(id, make, model, orientation, resolutionunits, wresolution, " +
                "hresolution, exifImageWidth, exifImageLength, imgSoftware, hueLocation, exifver, " +
                "fnum, isoSpeedRatings, imgExposureTime, imgShootTime, saveTime, finallTime, " +
                "imgExposureValue, maxAVal, imgMeteringModel, light, bulbuse, focallen, " +
                "colorfulspace) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        DBUtil.insertTmpSQL(sql, list);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("更新完毕,用时：" + (endTime2 - endTime)/1000);
    }

    /***
     * 修改缩略图信息
     * @throws Exception
     */
    public static void updateRelicThumb() throws Exception {
        Long startTime = System.currentTimeMillis();
        System.out.println("开始查询数据");
        List<LResource> list = new ArrayList<LResource>();
        LResource lTmp = null;
        String selectSQL = "select id,addresss from `l_resource`";
        List<LResource> lResourceList = DBUtil.executeQueryLResource(selectSQL);
        for(int i=0;i<lResourceList.size();i++){
            lTmp = new LResource();
            Long id = lResourceList.get(i).getId();
            lTmp.setId(id);
            String addresss = lResourceList.get(i).getAddresss();
            int index = addresss.lastIndexOf("/");
            String prefix = "thumb/"+addresss.substring(0,index);
            String suffix = addresss.substring(index+1);
            int pos = suffix.lastIndexOf(".");
            suffix = suffix.substring(0,pos)+".jpg";
            String smalladdr= prefix+"/small-thumb_"+suffix;
            String bigaddr= prefix+"/big-thumb_"+suffix;
            File file1 = new File("D:/Software/apache-tomcat-8.0.47/webapps/"+smalladdr);
            File file2 = new File("D:/Software/apache-tomcat-8.0.47/webapps/"+bigaddr);
            if(file1.exists() && file2.exists()){
                lTmp.setSmalladdr(smalladdr);
                lTmp.setBigaddr(bigaddr);
                list.add(lTmp);
            }
            if(i > 0 && i % 10000 == 0){ //每满10000 条执行输出一次
                System.out.println("当前处理条数 : "+ i);
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("组装完毕,用时：" + (endTime - startTime)/1000);
        System.out.println("list.size():"+list.size());

        String sql = "insert into `l_tmp2`(id,smalladdr,bigaddr) values(?,?,?)";
        DBUtil.insertTmpSQL(sql, list);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("更新完毕,用时：" + (endTime2 - endTime)/1000);
    }

    /***
     * 修改文物编号relicId
     * @throws Exception
     */
    public static void getRelicId() throws Exception {
        Long startTime = System.currentTimeMillis();
        System.out.println("开始查询数据");
        List<LResource> list = new ArrayList<LResource>();
        LResource lTmp = null;
        String selectSQL1 = "select id,identifier from `l_collection`";
        List<LCollection> lCollectionList = DBUtil.executeQueryLCollection(selectSQL1);
        //String selectSQL2 = "select id,imgComparison from `l_resource`";
        String selectSQL2 = "select id,imgComparison from `l_resource`";
        List<LResource> lResourceList = DBUtil.executeQueryLResource(selectSQL2);
        for(int i=0;i<lResourceList.size();i++){
            lTmp = new LResource();
            Long id = lResourceList.get(i).getId();
            String imgComparison = lResourceList.get(i).getImgcomparison();
            lTmp.setId(id);
            lTmp.setImgcomparison(imgComparison);
            for (LCollection lCollection: lCollectionList){
                if(imgComparison.equals(lCollection.getIdentifier())){
                    lTmp.setRelicid(lCollection.getId());
                    list.add(lTmp);
                    break;
                }
            }
            if(i > 0 && i % 10000 == 0){ //每满10000条执行输出一次
                System.out.println("当前处理条数 : "+ i);
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("组装完毕,用时：" + (endTime - startTime)/1000);
        System.out.println(list.size());

        String sql = "insert into `l_tmp`(id,relicid,imgComparison) values(?,?,?)";
        DBUtil.insertTmpSQL(sql, list);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("更新完毕,用时：" + (endTime2 - endTime)/1000);
    }


     /**
     * 得到json，并解析内容,存入数据库
     * @param filePath
     *
     */
    public static void saveJsonToDatabase(String filePath){
        List<LResource> lResourceList =new ArrayList<>();
        List<File> fileList = FileErgodic.getFileList(filePath);
        for (File file : fileList) {
            String jsonStr = Json2db.readJsonFile(file);
            JSONArray jsonArray = JSONArray.fromObject(jsonStr);
            JSONObject obj = null;
            for (int i = 0; i < jsonArray.size(); i++) {
                obj= JSONObject.fromObject(jsonArray.get(i));
                LResource lResource = (LResource)JSONObject.toBean(obj, LResource.class);
                if(lResource==null){
                    System.out.println("文件"+file.getPath()+"存在空数据");
                }else{
                    lResourceList.add(lResource);
                }
            }

        }
        String sql = "insert into `l_tmp`(relicid,`name`, addresss, format, " +
                "resolutionRatio, imgSize, imgComparison, resolutionRatioFlag, imgSizeFlag,"+
                "make, model, orientation, resolutionunits, wresolution, hresolution, " +
                "exifImageWidth, exifImageLength, imgSoftware, hueLocation, exifver, fnum, " +
                "isoSpeedRatings, imgExposureTime, imgShootTime,saveTime, finallTime, " +
                "imgExposureValue, maxAVal, imgMeteringModel, light,bulbuse, focallen, " +
                "colorfulspace) " +
                "values(?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?)";

        Long startTime = System.currentTimeMillis();
        System.out.println("开始插入数据");
        try {
            DBUtil.insertSQL(sql, lResourceList);
            Long endTime = System.currentTimeMillis();
            System.out.println("插入完毕,用时：" + (endTime - startTime)/1000);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


     /**
     * 读取json文件，返回json串
     * @param jsonFile
     * @return
     */

    public static String readJsonFile(File jsonFile) {
        String jsonStr = "";
        if (!jsonFile.exists()) {
            System.err.println("Can't Find " + jsonFile);
        }
        try {
            jsonStr = FileUtils.readFileToString(jsonFile, "utf-8");
            //System.out.println(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }



}




