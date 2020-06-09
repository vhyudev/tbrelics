package com.lxtech.tbrelics.service;

import com.lxtech.tbrelics.domain.LApplication;
import com.lxtech.tbrelics.vo.ApplicationResources;

import java.util.List;

public interface ApplicationService {

    int addDapplication(LApplication lApplication, Long[] resIdArray);

    List<ApplicationResources> selectApplication(long userId);

    List<ApplicationResources> selectApplications(long userId) throws Exception;

    ApplicationResources selectOneAppRes(long applicationId) throws Exception;

    int delOneApp(long applicationId) throws Exception;
}
