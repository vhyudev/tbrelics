package com.lxtech.tbrelics.controller;

import com.lxtech.tbrelics.service.ResourceCollectionService;
import com.lxtech.tbrelics.util.JsonTools;
import com.lxtech.tbrelics.view.ViewShopcart;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import com.lxtech.tbrelics.vo.ResourceCollectionVo;
import com.lxtech.tbrelics.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("resourceCollection")
public class ResourceCollectionController {

    @Autowired
    private ResourceCollectionService resourceCollectionService;

    /**
     * 无条件分页
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findAllPage")
    public ResultVo findAllPage(@RequestParam("pageNum")int pageNum,
                                @RequestParam("pageSize")int pageSize)  throws Exception {
        ResultVo resultVo = new ResultVo();
        ResourceCollectionVo vo = resourceCollectionService.findAllPage((pageNum-1)*pageSize,pageSize);
        resultVo.setStatus("200");
        resultVo.setMsg("无条件查询");
        resultVo.setResult(vo);
        return resultVo;
    }

    /**
     * 有条件分页
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping("findBySqlPage")
    public ResultVo findBySqlPage(@RequestParam("sqlConditional")String sqlConditional,
                                     @RequestParam("pageNum")int pageNum,
                                     @RequestParam("pageSize")int pageSize) throws Exception {
        ResultVo resultVo = new ResultVo();
        JsonTools jsonTools = new JsonTools();
        RelicandresourceAttribute relicandresourceAttribute = jsonTools.parseJSON(sqlConditional);
        relicandresourceAttribute.setStart((pageNum-1)*pageSize);
        relicandresourceAttribute.setEnd(pageSize);
        System.out.println(relicandresourceAttribute);
        ResourceCollectionVo vo = resourceCollectionService.findBySqlPage(relicandresourceAttribute);
        resultVo.setStatus("200");
        resultVo.setMsg("有条件分页");
        resultVo.setResult(vo);
        return resultVo;
    }

    /**
     * 文物号模糊查询
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
        ResourceCollectionVo vo = resourceCollectionService.findByLikePage(identifier,(pageNum-1)*pageSize,pageSize);
        resultVo.setStatus("200");
        resultVo.setMsg("文物号模糊查询");
        resultVo.setResult(vo);
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
        List<ViewShopcart> list=resourceCollectionService.findShopCart(userId);
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus("200");
        resultVo.setMsg("用户文物篮数据");
        resultVo.setResult(list);
        return resultVo;
    }

}
