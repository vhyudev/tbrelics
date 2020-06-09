package com.lxtech.tbrelics.util;

import com.lxtech.tbrelics.domain.LCollection;
import com.lxtech.tbrelics.domain.LResource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RLL
 * @date 2020/5/1
 */
public class DBUtil {
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String URL = "jdbc:mysql://101.200.77.209:3306/resourcetb?rewriteBatchedStatements=true&" +
            "useUnicode=true&characterEncoding=utf-8" +
            "&useSSL=false&serverTimezone = GMT";
    public static String DB_USERNAME = "root";
    public static String DB_PASSWORD = "qwer1234";

    /**
     * 加载驱动，只需要一次，用静态代码块 单数据库模式，需要扩展多数据库或使用主从数据库在此处进行扩展
     */
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 插入资源LResource(事务和批处理混合使用)
     * @param sql
     * @param lResourceList
     * @throws SQLException
     */
    public static void insertSQL(String sql, List<LResource> lResourceList) throws SQLException {
        Connection conn = null;
        PreparedStatement psts = null;
        try {

            conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            conn.setAutoCommit(false); // 设置手动提交

            int count = 0;
            psts = conn.prepareStatement(sql);

            while (count < lResourceList.size()) {
                psts.setLong(1, lResourceList.get(count).getRelicid());
                psts.setString(2, lResourceList.get(count).getName());
                psts.setString(3, lResourceList.get(count).getAddresss());
                psts.setString(4, lResourceList.get(count).getFormat());
                psts.setString(5, lResourceList.get(count).getResolutionratio());
                psts.setString(6, lResourceList.get(count).getImgsize());
                psts.setString(7, lResourceList.get(count).getImgcomparison());
                psts.setString(8, lResourceList.get(count).getResolutionratioflag());
                psts.setString(9, lResourceList.get(count).getImgsizeflag());

                psts.setString(10, lResourceList.get(count).getMake());
                psts.setString(11, lResourceList.get(count).getModel());
                psts.setString(12, lResourceList.get(count).getOrientation());
                psts.setString(13, lResourceList.get(count).getResolutionunits());
                psts.setString(14, lResourceList.get(count).getWresolution());
                psts.setString(15, lResourceList.get(count).getHresolution());
                psts.setString(16, lResourceList.get(count).getExifimagewidth());
                psts.setString(17, lResourceList.get(count).getExifimagelength());
                psts.setString(18, lResourceList.get(count).getImgsoftware());
                psts.setString(19, lResourceList.get(count).getHuelocation());
                psts.setString(20, lResourceList.get(count).getExifver());
                psts.setString(21, lResourceList.get(count).getFnum());
                psts.setString(22, lResourceList.get(count).getIsospeedratings());
                psts.setString(23, lResourceList.get(count).getImgexposuretime());
                psts.setString(24, lResourceList.get(count).getImgshoottime());
                psts.setString(25, lResourceList.get(count).getSavetime());
                psts.setString(26, lResourceList.get(count).getFinalltime());
                psts.setString(27, lResourceList.get(count).getImgexposurevalue());
                psts.setString(28, lResourceList.get(count).getMaxaval());
                psts.setString(29, lResourceList.get(count).getImgmeteringmodel());
                psts.setString(30, lResourceList.get(count).getLight());
                psts.setString(31, lResourceList.get(count).getBulbuse());
                psts.setString(32, lResourceList.get(count).getFocallen());
                psts.setString(33, lResourceList.get(count).getColorfulspace());

                psts.addBatch();          // 加入批量处理

                if(count > 0 && count % 10000 == 0){ //每满10000条执行插入一次
                    System.out.println("executeBatch : "+ count);
                    psts.executeBatch();
                    psts.clearBatch();
                    //如果不想出错后，完全没保留数据，则可以没执行一次提交一次，但得保证数据不会重复
                    //conn.commit();

                }

                count++;
            }
            psts.executeBatch(); // 执行批量处理
            psts.close();
            conn.commit();  // 提交，手动提交事务
            conn.setAutoCommit(true);//在把自动提交打开
            conn.close();

        } catch (Exception e) {
            try {
                // 发生异常，事务回滚！
                if (conn != null && !conn.isClosed()) {
                    conn.rollback();
                    conn.setAutoCommit(true);
                    System.out.println("插入失败，事务回滚！");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (psts != null) {
                psts.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    /**
     *  执行无参查询文物LCollection
     * @param sql
     * @throws SQLException
     */
    public static List<LCollection> executeQueryLCollection(String sql) throws SQLException {
        List<LCollection> lCollectionList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psts = null;
        ResultSet rs = null;
        try {

            conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            psts = conn.prepareStatement(sql);
            rs = psts.executeQuery();
            LCollection lCollection = null;

            while (rs.next()) {
                lCollection = new LCollection();
                lCollection.setId(rs.getLong("id"));
                lCollection.setIdentifier(rs.getString("identifier"));
                lCollectionList.add(lCollection);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (psts != null) {
                psts.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return lCollectionList;
    }

    /**
     *  执行无参查询资源LResource
     * @param sql
     * @throws SQLException
     */
    public static List<LResource> executeQueryLResource(String sql) throws SQLException {
        List<LResource> lResourceList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psts = null;
        ResultSet rs = null;
        try {

            conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            psts = conn.prepareStatement(sql);
            rs = psts.executeQuery();
            LResource lResource = null;

            while (rs.next()) {
                lResource = new LResource();
                lResource.setId(rs.getLong("id"));
                //lResource.setImgcomparison(rs.getString("imgComparison"));
                lResource.setAddresss(rs.getString("addresss"));
                lResourceList.add(lResource);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (psts != null) {
                psts.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return lResourceList;
    }



    /**
     * 插入资源临时表l_tmp(事务和批处理混合使用)
     * @param sql
     * @param lResourceList
     * @throws SQLException
     */
    public static void insertTmpSQL(String sql, List<LResource> lResourceList) throws SQLException {
        Connection conn = null;
        PreparedStatement psts = null;
        try {

            conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            conn.setAutoCommit(false); // 设置手动提交

            int count = 0;
            psts = conn.prepareStatement(sql);

            while (count < lResourceList.size()) {
                psts.setLong(1, lResourceList.get(count).getId());
                /*psts.setLong(2, lResourceList.get(count).getRelicid());
                psts.setString(3, lResourceList.get(count).getImgcomparison());*/
                psts.setString(2, lResourceList.get(count).getSmalladdr());
                psts.setString(3, lResourceList.get(count).getBigaddr());

                /*psts.setString(2, lResourceList.get(count).getMake());
                psts.setString(3, lResourceList.get(count).getModel());
                psts.setString(4, lResourceList.get(count).getOrientation());
                psts.setString(5, lResourceList.get(count).getResolutionunits());
                psts.setString(6, lResourceList.get(count).getWresolution());
                psts.setString(7, lResourceList.get(count).getHresolution());
                psts.setString(8, lResourceList.get(count).getExifimagewidth());
                psts.setString(9, lResourceList.get(count).getExifimagelength());
                psts.setString(10, lResourceList.get(count).getImgsoftware());
                psts.setString(11, lResourceList.get(count).getHuelocation());
                psts.setString(12, lResourceList.get(count).getExifver());
                psts.setString(13, lResourceList.get(count).getFnum());
                psts.setString(14, lResourceList.get(count).getIsospeedratings());
                psts.setString(15, lResourceList.get(count).getImgexposuretime());
                psts.setString(16, lResourceList.get(count).getImgshoottime());
                psts.setString(17, lResourceList.get(count).getSavetime());
                psts.setString(18, lResourceList.get(count).getFinalltime());
                psts.setString(19, lResourceList.get(count).getImgexposurevalue());
                psts.setString(20, lResourceList.get(count).getMaxaval());
                psts.setString(21, lResourceList.get(count).getImgmeteringmodel());
                psts.setString(22, lResourceList.get(count).getLight());
                psts.setString(23, lResourceList.get(count).getBulbuse());
                psts.setString(24, lResourceList.get(count).getFocallen());
                psts.setString(25, lResourceList.get(count).getColorfulspace());*/

                psts.addBatch();          // 加入批量处理

                if(count > 0 && count % 10000 == 0){ //每满10000条执行插入一次
                    System.out.println("executeBatch : "+ count);
                    psts.executeBatch();
                    psts.clearBatch();
                    //如果不想出错后，完全没保留数据，则可以没执行一次提交一次，但得保证数据不会重复
                    //conn.commit();

                }

                count++;
            }
            psts.executeBatch(); // 执行批量处理
            psts.close();
            conn.commit();  // 提交，手动提交事务
            conn.setAutoCommit(true);//在把自动提交打开
            conn.close();

        } catch (Exception e) {
            try {
                // 发生异常，事务回滚！
                if (conn != null && !conn.isClosed()) {
                    conn.rollback();
                    conn.setAutoCommit(true);
                    System.out.println("插入失败，事务回滚！");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (psts != null) {
                psts.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    /**
     *  执行无参查询资源临时表LTmp
     * @param sql
     * @throws SQLException
     */
    public static List<LResource> executeQueryLTmp(String sql) throws SQLException {
        List<LResource> lResourceList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psts = null;
        ResultSet rs = null;
        try {

            conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            psts = conn.prepareStatement(sql);
            rs = psts.executeQuery();
            LResource lResource = null;

            while (rs.next()) {
                lResource = new LResource();
                //lResource.setId(rs.getLong("id"));
                lResource.setAddresss(rs.getString("addresss"));

                if(!"".equals(rs.getString("make")) &&  rs.getString("make")!=null){
                    lResource.setMake(rs.getString("make"));
                }
                if(!"".equals(rs.getString("model")) &&  rs.getString("model")!=null){
                    lResource.setModel(rs.getString("model"));
                }
                if(!"".equals(rs.getString("orientation")) &&  rs.getString("orientation")!=null){
                    lResource.setOrientation(rs.getString("orientation"));
                }
                if(!"".equals(rs.getString("resolutionunits")) &&  rs.getString("resolutionunits")!=null){
                    lResource.setResolutionunits(rs.getString("resolutionunits"));
                }
                if(!"".equals(rs.getString("wresolution")) &&  rs.getString("wresolution")!=null){
                    lResource.setWresolution(rs.getString("wresolution"));
                }
                if(!"".equals(rs.getString("hresolution")) &&  rs.getString("hresolution")!=null){
                    lResource.setHresolution(rs.getString("hresolution"));
                }
                if(!"".equals(rs.getString("exifimagewidth")) &&  rs.getString("exifimagewidth")!=null){//图片宽度
                    lResource.setExifimagewidth(rs.getString("exifimagewidth"));
                }
                if(!"".equals(rs.getString("exifimagelength")) &&  rs.getString("exifimagelength")!=null){//图片高度
                    lResource.setExifimagelength(rs.getString("exifimagelength"));
                }
                if(!"".equals(rs.getString("imgsoftware")) &&  rs.getString("imgsoftware")!=null){
                    lResource.setImgsoftware(rs.getString("imgsoftware"));
                }
                if(!"".equals(rs.getString("huelocation")) &&  rs.getString("huelocation")!=null){
                    lResource.setHuelocation(rs.getString("huelocation"));
                }
                if(!"".equals(rs.getString("exifver")) &&  rs.getString("exifver")!=null){
                    lResource.setExifver(rs.getString("exifver"));
                }
                if(!"".equals(rs.getString("fnum")) &&  rs.getString("fnum")!=null){
                    lResource.setFnum(rs.getString("fnum"));
                }
                if(!"".equals(rs.getString("isospeedratings")) &&  rs.getString("isospeedratings")!=null){
                    lResource.setIsospeedratings(rs.getString("isospeedratings"));
                }
                if(!"".equals(rs.getString("imgexposuretime")) &&  rs.getString("imgexposuretime")!=null){
                    lResource.setImgexposuretime(rs.getString("imgexposuretime"));
                }
                if(!"".equals(rs.getString("imgshoottime")) &&  rs.getString("imgshoottime")!=null){//拍摄时间
                    lResource.setImgshoottime(rs.getString("imgshoottime"));
                }
                if(!"".equals(rs.getString("savetime")) &&  rs.getString("savetime")!=null){
                    lResource.setSavetime(rs.getString("savetime"));
                }
                if(!"".equals(rs.getString("finalltime")) &&  rs.getString("finalltime")!=null){
                    lResource.setFinalltime(rs.getString("finalltime"));
                }
                if(!"".equals(rs.getString("imgexposurevalue")) &&  rs.getString("imgexposurevalue")!=null){
                    lResource.setImgexposurevalue(rs.getString("imgexposurevalue"));
                }
                if(!"".equals(rs.getString("maxaval")) &&  rs.getString("maxaval")!=null){
                    lResource.setMaxaval(rs.getString("maxaval"));
                }
                if(!"".equals(rs.getString("imgmeteringmodel")) &&  rs.getString("imgmeteringmodel")!=null){
                    lResource.setImgmeteringmodel(rs.getString("imgmeteringmodel"));
                }
                if(!"".equals(rs.getString("light")) &&  rs.getString("light")!=null){
                    lResource.setLight(rs.getString("light"));
                }
                if(!"".equals(rs.getString("bulbuse")) &&  rs.getString("bulbuse")!=null){
                    lResource.setBulbuse(rs.getString("bulbuse"));
                }
                if(!"".equals(rs.getString("focallen")) &&  rs.getString("focallen")!=null){
                    lResource.setFocallen(rs.getString("focallen"));
                }
                if(!"".equals(rs.getString("colorfulspace")) &&  rs.getString("colorfulspace")!=null){
                    lResource.setColorfulspace(rs.getString("colorfulspace"));
                }
                
                lResourceList.add(lResource);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (psts != null) {
                psts.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return lResourceList;
    }




}
