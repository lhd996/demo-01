package com.lhd;

/**
 * @Author: liuhd
 * @Date: 2025/4/22 21:25
 * @Description:
 */
public class LHD {

    private LHDProperties lhdProperties;

    public LHDProperties getLhdProperties() {
        return lhdProperties;
    }

    public void setLhdProperties(LHDProperties lhdProperties) {
        this.lhdProperties = lhdProperties;
    }

    public void printLHDInfo(){
        System.out.println("name:" + lhdProperties.getName());
        System.out.println("age:" + lhdProperties.getAge());
    }
}
