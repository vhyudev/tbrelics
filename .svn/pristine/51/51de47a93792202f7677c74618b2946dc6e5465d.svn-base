package com.lxtech.tbrelics.service.impl;


import com.lxtech.tbrelics.domain.LApplication;
import com.lxtech.tbrelics.domain.LApplicationResource;
import com.lxtech.tbrelics.domain.LResource;
import com.lxtech.tbrelics.mapper.*;
import com.lxtech.tbrelics.service.ApplicationService;
import com.lxtech.tbrelics.util.FatherToChildUtil;
import com.lxtech.tbrelics.view.ViewApplicationResource;
import com.lxtech.tbrelics.vo.ApplicationResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

     @Autowired
     private LApplicationMapper lApplicationMapper;

     @Autowired
     private LApplicationResourceMapper lApplicationResourceMapper;

     @Autowired
     private ViewApplicationResourceMapper viewApplicationResourceMapper;

     @Autowired
     private LResourceMapper lResourceMapper;

     @Autowired
     private LUserMapper lUserMapper;

     private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    @Override
    public int addDapplication(LApplication lApplication, Long[] resIdArray) {
        int num =lApplicationMapper.insertApplication(lApplication);
        Long aId = lApplication.getId();
        LApplicationResource lApplicationResource=null;
        for(int i=0;i<resIdArray.length;i++){
            lApplicationResource  = new LApplicationResource();
            lApplicationResource.setApplicationid(aId);;
            lApplicationResource.setResourceid(resIdArray[i]);
            lApplicationResourceMapper.insert(lApplicationResource);
        }
        return num;
    }

    @Override
    public List<ApplicationResources> selectApplication(long userId) {
        List<ViewApplicationResource> list = viewApplicationResourceMapper.selectByViewAppRes(userId);
        List<ApplicationResources> collList = new ArrayList<>();
        ViewApplicationResource viewApplicationResource=null;
        List<LResource> resourceList=null;
        LResource lResource = null;
        for(int i=0;i<list.size();i++){
            viewApplicationResource=list.get(i);
            ApplicationResources applicationResources = null;
            for(int j=0;j<collList.size();j++){
                if(viewApplicationResource.getApplicationid()==collList.get(j).getId()){
                    applicationResources=collList.get(j);
                }
            }
            if(applicationResources==null){
                applicationResources = new ApplicationResources();
                resourceList = new ArrayList<>();
                applicationResources.setId(viewApplicationResource.getApplicationid());
                applicationResources.setApplytime(viewApplicationResource.getApplytime());
                String applyTimeStr = format.format(viewApplicationResource.getApplytime());
                applicationResources.setApplyTimeStr(applyTimeStr);
                applicationResources.setAppname(viewApplicationResource.getAppname());
                applicationResources.setTotal(viewApplicationResource.getTotal());
                applicationResources.setPurpose(viewApplicationResource.getPurpose());
                Date useTime = viewApplicationResource.getUsetime();
                if(useTime!=null){
                    applicationResources.setUsetime(useTime);
                    String useTimeStr = format.format(useTime);
                    applicationResources.setUseTimeStr(useTimeStr);
                }
                applicationResources.setRealname(viewApplicationResource.getRealname());
                applicationResources.setUserid(userId);
                lResource = new LResource();
                lResource.setAddresss(viewApplicationResource.getAddresss());
                lResource.setId(viewApplicationResource.getRelicid());
                lResource.setImgsize(viewApplicationResource.getImgsize());
                lResource.setName(viewApplicationResource.getName());
                lResource.setFormat(viewApplicationResource.getFormat());
                lResource.setResolutionratio(viewApplicationResource.getResolutionratio());
                resourceList.add(lResource);
                applicationResources.setResourceList(resourceList);
                collList.add(applicationResources);
            }else{
                lResource = new LResource();
                lResource.setAddresss(viewApplicationResource.getAddresss());
                lResource.setId(viewApplicationResource.getRelicid());
                lResource.setImgsize(viewApplicationResource.getImgsize());
                lResource.setName(viewApplicationResource.getName());
                lResource.setFormat(viewApplicationResource.getFormat());
                lResource.setResolutionratio(viewApplicationResource.getResolutionratio());
                List<LResource> resourceList1 = applicationResources.getResourceList();
                resourceList1.add(lResource);
            }
        }
        return collList;
    }

    @Override
    public List<ApplicationResources> selectApplications(long userId) throws Exception {
        List<ApplicationResources> applicationResourcesList = new ArrayList<>();
        List<LApplication> applicationList = lApplicationMapper.selectApps(userId);
        ApplicationResources applicationResources=null;
        List<LResource> lResourceList=null;
        for(LApplication lApplication :applicationList  ){
            applicationResources = new ApplicationResources();
            FatherToChildUtil.fatherToChild(lApplication, applicationResources);
            String applyTimeStr = format.format(lApplication.getApplytime());
            applicationResources.setApplyTimeStr(applyTimeStr);
            Date useTime = lApplication.getUsetime();
            if(useTime!=null){
                applicationResources.setUsetime(useTime);
                String useTimeStr = format.format(useTime);
                applicationResources.setUseTimeStr(useTimeStr);
            }
            String realname = lUserMapper.selectByPrimaryKey(userId).getRealname();
            applicationResources.setRealname(realname);

            List<Long> list = lApplicationResourceMapper.selectResourceID(lApplication.getId());
            lResourceList = new ArrayList<>();
            for(Long resID:list){
                lResourceList.add(lResourceMapper.selectByPrimaryKey(resID));
            }
            applicationResources.setResourceList(lResourceList);
            applicationResourcesList.add(applicationResources);
        }
        return applicationResourcesList;
    }


    @Override
    public ApplicationResources selectOneAppRes(long applicationId) throws Exception {
        ApplicationResources applicationResources = new ApplicationResources();
        LApplication  lApplication = lApplicationMapper.selectByPrimaryKey(applicationId);
        FatherToChildUtil.fatherToChild(lApplication, applicationResources);
        String applyTimeStr = format.format(lApplication.getApplytime());
        applicationResources.setApplyTimeStr(applyTimeStr);
        Date useTime = lApplication.getUsetime();
        if(useTime!=null){
            applicationResources.setUsetime(useTime);
            String useTimeStr = format.format(useTime);
            applicationResources.setUseTimeStr(useTimeStr);
        }
        Long userId = lApplication.getUserid();
        String realname = lUserMapper.selectByPrimaryKey(userId).getRealname();
        applicationResources.setRealname(realname);
        List<LResource> list = new ArrayList<>();
        List<Long>  resourceList = lApplicationResourceMapper.selectResourceID(applicationId);
        LResource lResource = null;
        for(int i=0;i<resourceList.size();i++){
            lResource=lResourceMapper.selectByPrimaryKey(resourceList.get(i));
            list.add(lResource);
        }
        applicationResources.setResourceList(list);
        return applicationResources;
    }


    @Override
    public int delOneApp(long applicationId) throws Exception {
        List<Long>  arIdList = lApplicationResourceMapper.selectARID(applicationId);
        for(int i=0;i<arIdList.size();i++){
            lApplicationResourceMapper.deleteByPrimaryKey(arIdList.get(i));
        }
        int i = lApplicationMapper.deleteByPrimaryKey(applicationId);
        return i;
    }
}
