package com.outer;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: liuhd
 * @Date: 2025/4/21 19:40
 * @Description:
 */

public class SelectorImpl implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.outer.OuterConfig"};
    }
}
