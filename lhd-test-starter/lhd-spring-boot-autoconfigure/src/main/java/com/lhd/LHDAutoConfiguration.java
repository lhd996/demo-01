package com.lhd;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuhd
 * @Date: 2025/4/22 21:23
 * @Description:
 */

@Configuration
@EnableConfigurationProperties({LHDProperties.class})
public class LHDAutoConfiguration {

    @Bean
    public LHD lhd(LHDProperties lhdProperties){
        LHD lhd = new LHD();
        lhd.setLhdProperties(lhdProperties);
        return lhd;
    }
}
