package com.inner;

import com.outer.D;
import com.outer.OuterConfig;
import com.outer.SelectorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;

/**
 * @Author: liuhd
 * @Date: 2025/4/21 19:41
 * @Description:
 */

@SpringBootApplication
@EnableConfig
public class InnerApplication {
    public static void main(String[] args) {
        SpringApplication.run(InnerApplication.class, args);
    }
}
