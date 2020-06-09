package com.lxtech.tbrelics.controller;

import com.lxtech.tbrelics.domain.LApplication;
import com.lxtech.tbrelics.service.ApplicationService;
import com.lxtech.tbrelics.service.CollectionService;
import com.lxtech.tbrelics.vo.ApplicationResources;
import com.lxtech.tbrelics.vo.ResultVo;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("application")
public class ApplicationCotroller {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private CollectionService collectionService;

    /**
     * 资源清单申请
     * @return
     * @throws Exception
     */
    @RequestMapping("applyApplications")
    public ResultVo applyApplications(@RequestParam("userId")long userId, @RequestParam("ids")String ids
            , @RequestParam("listName")String listName , @RequestParam("use")String use

    ) throws Exception {
        ResultVo resultVo = new ResultVo();
        LApplication lApplication = new LApplication();
        lApplication.setUserid(userId);
        lApplication.setAppname(listName);
        lApplication.setPurpose(use);
        lApplication.setApplytime(new Date());
        lApplication.setStatus("未审核");
        String[] strs=ids.split(",");
        lApplication.setTotal(strs.length);
        Long[] residArray = (Long[])ConvertUtils.convert(strs,Long.class);
        int i = applicationService.addDapplication(lApplication,residArray);
        if(i==0){
            resultVo.setStatus("202");
            resultVo.setMsg("申请失败");
        }else{
            long[] resourceIdArray = (long[])ConvertUtils.convert(strs,long.class);
            collectionService.delBatchUserResource(userId, resourceIdArray);
            resultVo.setStatus("200");
            resultVo.setMsg("申请提交成功");
        }
        return resultVo;
    }

    /**
     * 查看用户资源清单
     * @param userId
     * @return
     * @throws Exception
     */
    @RequestMapping("findApplications")
    public ResultVo findApplications(@RequestParam("userId")Long userId) throws Exception {
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus("200");
        resultVo.setMsg("用户文物篮数据");
       // List<ApplicationResources> list =applicationService.selectApplication(userId);
        List<ApplicationResources> list =applicationService.selectApplications(userId);
        resultVo.setResult(list);
        return resultVo;
    }

    /**
     * 查看一条资源清单
     * @param applicationId  资源ID
     * @return
     * @throws Exception
     */
    @RequestMapping("findOneApplication")
    public ResultVo findOneApplication(@RequestParam("applicationId")Long applicationId) throws Exception {
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus("200");
        resultVo.setMsg("用户文物篮数据");
        ApplicationResources  applicationResources =applicationService.selectOneAppRes(applicationId);
        resultVo.setResult(applicationResources);
        return resultVo;
    }

    @RequestMapping("delOneApplication")
    public ResultVo delOneApplication(@RequestParam("applicationId")Long applicationId) throws Exception {
        ResultVo resultVo = new ResultVo();
        int i = applicationService.delOneApp(applicationId);
        if(i==0){
            resultVo.setStatus("202");
            resultVo.setMsg("删除失败");
        }else{
            resultVo.setStatus("200");
            resultVo.setMsg("删除成功");
        }
        return resultVo;
    }
}
