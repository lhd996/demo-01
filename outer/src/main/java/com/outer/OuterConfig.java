package com.outer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuhd
 * @Date: 2025/4/21 19:35
 * @Description:
 */
@Configuration
public class OuterConfig {

    @Bean
    public A a(){
        return new A();
    }
    @Bean
    public B b(){
        return new B();
    }

}
