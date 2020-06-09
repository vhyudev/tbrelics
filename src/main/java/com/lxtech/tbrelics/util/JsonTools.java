package com.lxtech.tbrelics.util;


import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析parameter
 * @author RLL
 * @date 2019/1/3
 */
public class JsonTools {
    public String parseJSONWithJSONObject(String oldSQL, String JsonData) throws JSONException {
        StringBuffer sql = new StringBuffer();
        sql.append(oldSQL);
        JSONArray jsonArray = new JSONArray(JsonData);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //boolean isMultiple = jsonObject.getBoolean("isMultiple");
            String id = jsonObject.getString("id");
            JSONArray ValueList = jsonObject.getJSONArray("ValueList");
            if (ValueList.length() > 0){
                String value = (String) ValueList.get(0);
                sql.append(" and ").append(id).append("= '").append(value).append("'");
            }

        }
        return sql.toString();

    }


    public RelicandresourceAttribute parseJSON(String JsonData) throws JSONException {
        RelicandresourceAttribute relicandresourceAttribute = new RelicandresourceAttribute();
        JSONArray jsonArray = new JSONArray(JsonData);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //boolean isMultiple = jsonObject.getBoolean("isMultiple");
            String id = jsonObject.getString("id").trim();
            JSONArray ValueList = jsonObject.getJSONArray("ValueList");
            if (ValueList.length() > 0){
                String value = (String) ValueList.get(0);
                if(id.equals("wwlb")){//藏品类别
                    relicandresourceAttribute.setWorkType(value);
                }
                if(id.equals("cpnd")){//藏品年代
                    relicandresourceAttribute.setPeriod(value);
                }
                if(id.equals("cpjb")){//藏品级别
                    relicandresourceAttribute.setLevel(value);
                }
                if(id.equals("tpgs")){//图片格式
                    relicandresourceAttribute.setFormat(value);
                }
                if(id.equals("fbl")){//图片分辨率Flag
                    relicandresourceAttribute.setResolutionRatioFlag(value);
                }
                if(id.equals("tpdx")){//图片大小Flag
                    relicandresourceAttribute.setImgSizeFlag(value);
                }
            }
        }
        return relicandresourceAttribute;
    }

    public static void main(String[] args) {

        String s = "[{\"ValueList\":[],\"isMultiple\":false,\"id\":\"wwlb\"},"+
                "{\"ValueList\":[],\"isMultiple\":false,\"id\":\"cpnd\"},"+
                "{\"ValueList\":[],\"isMultiple\":false,\"id\":\"cpjb\"},"+
                "{\"ValueList\":[],\"isMultiple\":false,\"id\":\"tpgs\"},"+
                "{\"ValueList\":[\"500x900\"],\"isMultiple\":true,\"id\":\"fbl\"}]";

        JsonTools jsonTools = new JsonTools();
        RelicandresourceAttribute relicandresourceAttribute = null;
        try {
            relicandresourceAttribute = jsonTools.parseJSON(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(relicandresourceAttribute);
    }
}
