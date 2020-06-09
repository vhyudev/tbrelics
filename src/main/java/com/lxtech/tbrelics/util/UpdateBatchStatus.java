package com.lxtech.tbrelics.util;

import java.io.Serializable;
import java.util.List;

public class UpdateBatchStatus  implements Serializable {

    private List<Long> relicID;
    private Long num;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public List<Long> getRelicID() {
        return relicID;
    }

    public void setRelicID(List<Long> relicID) {
        this.relicID = relicID;
    }
}
