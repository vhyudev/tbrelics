package com.lxtech.tbrelics.vo;

import java.io.Serializable;

public class ResultVo implements Serializable {
    private String status = null;

    private String msg = null;


    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
