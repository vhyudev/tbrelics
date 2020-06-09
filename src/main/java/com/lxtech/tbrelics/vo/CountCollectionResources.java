package com.lxtech.tbrelics.vo;

import java.io.Serializable;
import java.util.List;

public class CountCollectionResources  implements Serializable {
    private int count;
    private List<CollectionResources> collectionResourcesList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CollectionResources> getCollectionResourcesList() {
        return collectionResourcesList;
    }

    public void setCollectionResourcesList(List<CollectionResources> collectionResourcesList) {
        this.collectionResourcesList = collectionResourcesList;
    }
}
