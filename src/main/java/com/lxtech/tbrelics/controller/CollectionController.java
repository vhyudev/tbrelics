package com.lxtech.tbrelics.controller;

import com.lxtech.tbrelics.domain.LUserResource;
import com.lxtech.tbrelics.service.CollectionService;
import com.lxtech.tbrelics.util.JsonTools;
import com.lxtech.tbrelics.util.Test;
import com.lxtech.tbrelics.view.ViewResourceCollection;
import com.lxtech.tbrelics.vo.CollectionResources;
import com.lxtech.tbrelics.vo.CountCollectionResources;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import com.lxtech.tbrelics.vo.ResultVo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("relic")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @RequestMapping("selectByResourceId")
    public ResultVo selectByResourceId(@RequestParam("id")Long id){
        ResultVo resultVo = new ResultVo();
        ViewResourceCollection vrc = collectionService.selectByResourceId(id);
        resultVo.setStatus("200");
        resultVo.setMsg("成功");
        resultVo.setResult(vrc);
        return resultVo;
    }

    /**
     * 查询过滤条件
     * @return
     * @throws Exception
     */
    @RequestMapping("findSearchCriteria")
    public ResultVo findSearchCriteria() throws Exception{
        ResultVo resultVo = new ResultVo();
        JSONObject jsonObject = collectionService.findSearchCriteria();
        resultVo.setStatus("200");
        resultVo.setMsg("成功");
        resultVo.setResult(jsonObject);
        return resultVo;
    }


    /**
     * 查询文物年代、类别
     * @return
     * @throws Exception
     */
    @RequestMapping("findRelicAgeType")
    public ResultVo findRelicAgeType() throws Exception {
        ResultVo resultVo = new ResultVo();
        List<String> setAge = collectionService.findRelicsAge();
        JSONArray jsonArrayAge=new JSONArray();
        JSONObject jsonObjectAge=null;
        for (String str : setAge) {
            jsonObjectAge = new JSONObject();
            jsonObjectAge.put("value",str);
            jsonObjectAge.put("text",str);
            jsonArrayAge.add(jsonObjectAge);
        }

        List<String> setType = collectionService.findRelicsType();
        JSONArray jsonArrayType=new JSONArray();
        JSONObject jsonObjectType=null;
        for (String str : setType) {
            jsonObjectType = new JSONObject();
            jsonObjectType.put("value", str);
            jsonObjectType.put("text", str);
            jsonArrayType.add(jsonObjectType);
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ageData", jsonArrayAge);
        jsonObject.put("typeData",jsonArrayType);

        resultVo.setStatus("200");
        resultVo.setMsg("成功");
        resultVo.setResult(jsonObject);
        return resultVo;
    }

    /**
     * 查询文物年代
     * @return
     * @throws Exception
     */
    @RequestMapping("findRelicAge")
    public ResultVo findRelicAge() throws Exception {
        ResultVo resultVo = new ResultVo();
        List<String> setAge = collectionService.findRelicsAge();
        JSONArray jsonArrayAge=new JSONArray();
        JSONObject jsonObjectAge=null;
        for (String str : setAge) {
            jsonObjectAge = new JSONObject();
            jsonObjectAge.put("value",str);
            jsonObjectAge.put("text",str);
            jsonArrayAge.add(jsonObjectAge);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ageData", jsonArrayAge);
        resultVo.setStatus("200");
        resultVo.setMsg("成功");
        resultVo.setResult(jsonObject);
        return resultVo;
    }


    /**
     * 用户文物篮数据"
     * @param userId
     * @return
     * @throws Exception
     */
    @RequestMapping("findShopcart")
    public ResultVo findShopcart(@RequestParam("userId")Long userId) throws Exception {
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus("200");
        resultVo.setMsg("用户文物篮数据");
        List<CollectionResources> list =collectionService.selectShopCarts(userId);
        resultVo.setResult(list);
        return resultVo;
    }

    /**
     * 加入文物蓝
     * @param userId
     * @param resourceId
     * @return
     * @throws Exception
     */
    @RequestMapping("insertShopcart")
    public ResultVo insertShopcart(@RequestParam("userId")Long userId,@RequestParam("resourceId")long resourceId) throws Exception {
        ResultVo resultVo = new ResultVo();
        LUserResource lUserResource = new LUserResource();
        lUserResource.setResid(resourceId);
        lUserResource.setUserid(userId);
        int i =collectionService.insertUserResource(lUserResource);
        if(i==0){
            resultVo.setStatus("202");
            resultVo.setMsg("加入文物蓝失败");
        }else{
            resultVo.setStatus("200");
            //List<CollectionResources> list =collectionService.selectShopCarts(userId);
            resultVo.setMsg("加入文物蓝成功");
            //resultVo.setResult(list);
        }
        return resultVo;
    }

    /**
     * 删除单个文物蓝数据
     * @param userId
     * @param resourceId
     * @return
     * @throws Exception
     */
    @RequestMapping("delShopcart")
    public ResultVo delShopcart(@RequestParam("userId")Long userId,@RequestParam("resourceId")long resourceId) throws Exception {
        ResultVo resultVo = new ResultVo();
        int i =collectionService.delUserResource(userId, resourceId);
        if(i==0){
            resultVo.setStatus("202");
            resultVo.setMsg("删除文物蓝失败");
        }else{
            resultVo.setStatus("200");
            List<CollectionResources> list =collectionService.selectShopCarts(userId);
            resultVo.setMsg("删除文物蓝成功");
            resultVo.setResult(list);
        }
        return resultVo;
    }



    /**
     * 删除多个文物蓝数据
     * @param userId
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("delBatchShopcart")
    public ResultVo delBatchShopcart(@RequestParam("userId")Long userId,@RequestParam("ids")String ids) throws Exception {
        ResultVo resultVo = new ResultVo();
        String[] strs=ids.split(",");
        long[] resourceIdArray = (long[])ConvertUtils.convert(strs,long.class);
        int i =collectionService.delBatchUserResource(userId, resourceIdArray);
        if(i==0){
            resultVo.setStatus("202");
            resultVo.setMsg("删除文物蓝失败");
        }else{
            resultVo.setStatus("200");
            resultVo.setMsg("删除文物蓝成功");
        }
        return resultVo;
    }

    /**
     * 无条件分页
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findCollectionNoTotalPage")
    public ResultVo findCollectionNoTotalPage(@RequestParam("pageNum")int pageNum,@RequestParam("pageSize")int pageSize) throws Exception {
        ResultVo resultVo = new ResultVo();
        /*CountCollectionResources countCollectionResources = new CountCollectionResources();//返回对象
        int count =collectionService.noTotal();
        countCollectionResources.setCount(count);
        List<CollectionResources> collectionResourcesList = collectionService.selectBysql((pageNum-1)*pageSize,pageSize);
        countCollectionResources.setCollectionResourcesList(collectionResourcesList);*/
        CountCollectionResources countCollectionResources = collectionService.findAllByPage((pageNum-1)*pageSize,pageSize);
        resultVo.setStatus("200");
        resultVo.setMsg("无条件查询总条数");
        resultVo.setResult(countCollectionResources);
        return resultVo;
    }

    /**
     * 有条件分页
     * @param sqlConditional
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findCollectionHaveTotalPage")
    public ResultVo findCollectionHaveTotalPage(@RequestParam("sqlConditional")String sqlConditional,@RequestParam("pageNum")int pageNum,@RequestParam("pageSize")int pageSize) throws Exception {
        System.out.println("pageNum打印说明走了该方法==========="+pageNum);
        ResultVo resultVo = new ResultVo();
        JsonTools jsonTools = new JsonTools();
        RelicandresourceAttribute relicandresourceAttribute = jsonTools.parseJSON(sqlConditional);
        relicandresourceAttribute.setStart((pageNum-1)*pageSize);
        relicandresourceAttribute.setEnd(pageSize);
        System.out.println(relicandresourceAttribute);
       /*CountCollectionResources countCollectionResources = new CountCollectionResources();//返回对象
        int count =collectionService.haveTotal(relicandresourceAttribute);
        countCollectionResources.setCount(count);
        List<CollectionResources> collectionResourcesList = collectionService.selectByHavesql(relicandresourceAttribute);
        countCollectionResources.setCollectionResourcesList(collectionResourcesList);*/
        CountCollectionResources countCollectionResources = collectionService.findSearchByPage(relicandresourceAttribute);
        resultVo.setStatus("200");
        resultVo.setMsg("有条件查询总条数");
        resultVo.setResult(countCollectionResources);
        return resultVo;
    }

    /**
     * 文物号查询（有资源）
     * @param identifier
     * @return
     * @throws Exception
     */
    @RequestMapping("findCollectionByIdentifier")
    public ResultVo findCollectionByIdentifier(@RequestParam("identifier")String identifier,@RequestParam("cateid")String cateid) throws Exception {
        ResultVo resultVo = new ResultVo();
        CountCollectionResources countCollectionResources = new CountCollectionResources();//返回对象
        String str = identifier.replaceAll(" ", "").toUpperCase();//转成大写
        String newStr = Test.addBlank(str);
        System.out.println("str:"+str);
        System.out.println("newStr:"+newStr);
        if("0".equals(cateid)){//精确检索
            List<CollectionResources> collectionResourcesList = collectionService.selectRelicByIdentifier(str);
            if(collectionResourcesList.size() > 0){
                countCollectionResources.setCount(collectionResourcesList.size());
                countCollectionResources.setCollectionResourcesList(collectionResourcesList);
            }else{
                List<CollectionResources> collectionResourcesList2 = collectionService.selectRelicByIdentifier(newStr);
                countCollectionResources.setCount(collectionResourcesList2.size());
                countCollectionResources.setCollectionResourcesList(collectionResourcesList2);
            }
        }else if("1".equals(cateid)){//模糊搜索
            List<CollectionResources> collectionResourcesList = collectionService.selectRelicListByIdentifier(str);
            if(collectionResourcesList.size() > 0){
                countCollectionResources.setCount(collectionResourcesList.size());
                countCollectionResources.setCollectionResourcesList(collectionResourcesList);
            }else{
                List<CollectionResources> collectionResourcesList2 = collectionService.selectRelicListByIdentifier(newStr);
                countCollectionResources.setCount(collectionResourcesList2.size());
                countCollectionResources.setCollectionResourcesList(collectionResourcesList2);
            }
        }

        resultVo.setStatus("200");
        resultVo.setMsg("文物号精确查询");
        resultVo.setResult(countCollectionResources);
        return resultVo;
    }

    /**
     * 文物号查询
     * @param identifier
     * @param cateid
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findRelicByIdentifier")
    public ResultVo findRelicByIdentifier(@RequestParam("identifier")String identifier,@RequestParam("cateid")String cateid,
                                          @RequestParam("pageNum")int pageNum,@RequestParam("pageSize")int pageSize) throws Exception {
        ResultVo resultVo = new ResultVo();
        CountCollectionResources countCollectionResources = new CountCollectionResources();//返回对象
        String str = identifier.toUpperCase();//转成大写
        System.out.println("str:"+str);
        int start = (pageNum-1)*pageSize;
        if("0".equals(cateid)) {//精确检索
            List<CollectionResources> collectionResourcesList = collectionService.selectByIdentifier(str,start,pageSize);
            countCollectionResources.setCount(collectionService.selectCountByIdentifier(str));
            countCollectionResources.setCollectionResourcesList(collectionResourcesList);
        }else if("1".equals(cateid)) {//模糊搜索
            List<CollectionResources> collectionResourcesList = collectionService.selectListByIdentifier(str,start,pageSize);
            countCollectionResources.setCount(collectionService.selecListCounttByIdentifier(str));
            countCollectionResources.setCollectionResourcesList(collectionResourcesList);
        }
        resultVo.setStatus("200");
        resultVo.setMsg("文物号查询");
        resultVo.setResult(countCollectionResources);
        return resultVo;

    }

    /**
     * 模糊查询
     * @param identifier
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findRelicByLike")
    public ResultVo findRelicByLike(@RequestParam("identifier")String identifier,
                                          @RequestParam("pageNum")int pageNum,
                                    @RequestParam("pageSize")int pageSize) throws Exception {
        ResultVo resultVo = new ResultVo();
        String str = identifier.toUpperCase();//转成大写
        System.out.println("str:"+str);
        int start = (pageNum-1)*pageSize;
        /*CountCollectionResources countCollectionResources = new CountCollectionResources();//返回对象
        List<CollectionResources> collectionResourcesList = collectionService.selectListByIdentifier(str,start,pageSize);
        countCollectionResources.setCount(collectionService.selecListCounttByIdentifier(str));
        countCollectionResources.setCollectionResourcesList(collectionResourcesList);*/
        CountCollectionResources countCollectionResources = collectionService.findIdentifierLike(str,start,pageSize);
        if(countCollectionResources.getCount()<1){
            countCollectionResources = collectionService.findNameLike(str,start,pageSize);
        }
        resultVo.setStatus("200");
        resultVo.setMsg("文物号查询");
        resultVo.setResult(countCollectionResources);
        return resultVo;

    }



}
