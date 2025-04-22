package com.example;

import com.lhd.LHD;
import com.example.TestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: liuhd
 * @Date: 2025/4/22 21:45
 * @Description:
 */

@SpringBootTest
public class MyTest {


    @Autowired
    private LHD lhd;
    @Test
    public void test(){
        lhd.printLHDInfo();
    }
}
