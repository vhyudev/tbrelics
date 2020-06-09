package com.lxtech.tbrelics.view;

import java.util.Date;

public class ViewApplicationResource {
    private Long id;

    private Long applicationid;

    private Long resourceid;

    private Long userid;

    private Date applytime;

    private Date usetime;

    private String name;

    private String addresss;

    private String format;

    private String resolutionratio;

    private String imgsize;

    private Long relicid;

    private Integer total;

    private String purpose;

    private String status;

    private String realname;

    private String appname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(Long applicationid) {
        this.applicationid = applicationid;
    }

    public Long getResourceid() {
        return resourceid;
    }

    public void setResourceid(Long resourceid) {
        this.resourceid = resourceid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getUsetime() {
        return usetime;
    }

    public void setUsetime(Date usetime) {
        this.usetime = usetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss == null ? null : addresss.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getResolutionratio() {
        return resolutionratio;
    }

    public void setResolutionratio(String resolutionratio) {
        this.resolutionratio = resolutionratio == null ? null : resolutionratio.trim();
    }

    public String getImgsize() {
        return imgsize;
    }

    public void setImgsize(String imgsize) {
        this.imgsize = imgsize == null ? null : imgsize.trim();
    }

    public Long getRelicid() {
        return relicid;
    }

    public void setRelicid(Long relicid) {
        this.relicid = relicid;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }
}