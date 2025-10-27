package org.example.di_springtest.filter;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class WebConfig {
  @Bean
  public FilterRegistrationBean<LogFilter> logFilter() {
    FilterRegistrationBean<LogFilter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new LogFilter());
    bean.setOrder(1);
    bean.addUrlPatterns("/*"); // 전역
    return bean;
  }

  @Bean
  public FilterRegistrationBean<Log2Filter> log2Filter() {
    FilterRegistrationBean<Log2Filter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new Log2Filter());
    bean.setOrder(2);
    bean.addUrlPatterns("/posts/delete/*", "/posts/update/*"); // 부분 경로
    return bean;
  }
}
