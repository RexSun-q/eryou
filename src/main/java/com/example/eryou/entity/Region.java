package com.example.eryou.entity;

public class Region {

    // 自然id 主键
    private Integer regionId;

    // 区域名称
    private String regionName;

    // 区域等级
    private Integer regionLevel;

    // 上一次区域等级
    private Integer regionParentLevel;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(Integer regionLevel) {
        this.regionLevel = regionLevel;
    }

    public Integer getRegionParentLevel() {
        return regionParentLevel;
    }

    public void setRegionParentLevel(Integer regionParentLevel) {
        this.regionParentLevel = regionParentLevel;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", regionName='" + regionName + '\'' +
                ", regionLevel=" + regionLevel +
                ", regionParentLevel=" + regionParentLevel +
                '}';
    }
}
