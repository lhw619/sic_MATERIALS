package com.example.config;

import com.example.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *   国家信息中心
 *   待上线域名sic.gov.cn
 *   http://39.103.177.12/  admin:sic
 *   liuli@www.sic.gov.cn
 **/
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").excludePathPatterns("materils_v2.0/index.html");
    }
}
