package com.inner;


import com.outer.D;
import com.outer.OuterConfig;
import com.outer.SelectorImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @Author: liuhd
 * @Date: 2025/4/21 21:26
 * @Description:
 */
@SpringBootTest
public class YTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void test1(){
        System.out.println(applicationContext.getBean("a"));
        System.out.println(applicationContext.getBean("b"));
        //System.out.println(applicationContext.getBean("c"));
        System.out.println(applicationContext.getBean(OuterConfig.class));
        //System.out.println(applicationContext.getBean(D.class));
        //System.out.println(applicationContext.getBean(SelectorImpl.class));
    }
}
