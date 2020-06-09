package com.lxtech.tbrelics.vo;

import com.lxtech.tbrelics.domain.LResource;

import java.io.Serializable;
import java.util.List;

public class UserResources implements Serializable {

    private  int count;
    private List<LResource> resourceList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<LResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<LResource> resourceList) {
        this.resourceList = resourceList;
    }
}
