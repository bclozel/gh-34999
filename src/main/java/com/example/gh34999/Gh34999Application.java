package com.example.gh34999;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class Gh34999Application {

	public static void main(String[] args) {
		SpringApplication.run(Gh34999Application.class, args);
	}

	@Bean
	public FilterRegistrationBean<ShallowEtagHeaderFilter> shallowEtagHeaderFilter() {
		ShallowEtagHeaderFilter shallowEtagHeaderFilter = new ShallowEtagHeaderFilter();
		FilterRegistrationBean<ShallowEtagHeaderFilter> filterRegistrationBean = new FilterRegistrationBean<>(shallowEtagHeaderFilter);
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
}
