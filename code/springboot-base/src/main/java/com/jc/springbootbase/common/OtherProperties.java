package com.jc.springbootbase.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// 读取other.properties中以other开头的配置项
@Component
@ConfigurationProperties(prefix="other")
@PropertySource(value = "classpath:other.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
public class OtherProperties {
    private String title;
    private String blog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}