package com.lxtech.tbrelics.vo;

import com.lxtech.tbrelics.domain.LCollection;
import com.lxtech.tbrelics.domain.LResource;

import java.util.List;

public class CollectionResources  extends LCollection {

    private List<LResource> resourceList;

    public List<LResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<LResource> resourceList) {
        this.resourceList = resourceList;
    }
}
