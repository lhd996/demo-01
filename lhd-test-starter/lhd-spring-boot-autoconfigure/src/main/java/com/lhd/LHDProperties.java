package com.lhd;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: liuhd
 * @Date: 2025/4/22 21:25
 * @Description:
 */

// 不可以添加@Component注解，因为这是用户引入的三方模块，不能扫描到这个bean
// 从用户的配置文件中读取lhd:
@ConfigurationProperties(prefix = "lhd")
public class LHDProperties {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
