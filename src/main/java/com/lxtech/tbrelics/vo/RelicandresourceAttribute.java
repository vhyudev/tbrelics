package com.lxtech.tbrelics.vo;

import java.io.Serializable;

public class RelicandresourceAttribute implements Serializable {
    private  long relicId;
    private  String period;//文物年代
    private  String workType;//文物类别
    private  String level;//文物级别
    private  String format;//图片格式
    private  String imgSizeFlag;//图片大小
    private  String resolutionRatioFlag;//图片比例
    private  int start;
    private  int end;

    public long getRelicId() {
        return relicId;
    }

    public void setRelicId(long relicId) {
        this.relicId = relicId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getImgSizeFlag() {
        return imgSizeFlag;
    }

    public void setImgSizeFlag(String imgSizeFlag) {
        this.imgSizeFlag = imgSizeFlag;
    }

    public String getResolutionRatioFlag() {
        return resolutionRatioFlag;
    }

    public void setResolutionRatioFlag(String resolutionRatioFlag) {
        this.resolutionRatioFlag = resolutionRatioFlag;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "RelicandresourceAttribute{" +
                "period='" + period + '\'' +
                ", workType='" + workType + '\'' +
                ", level='" + level + '\'' +
                ", format='" + format + '\'' +
                ", imgSizeFlag='" + imgSizeFlag + '\'' +
                ", resolutionRatioFlag='" + resolutionRatioFlag + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
