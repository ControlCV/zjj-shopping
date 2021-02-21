package com.pflife.common.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;

/**
 * mybatisplus配置
 * 说明:
 * 1. mapper扫描路径
 * 2. 指定方言
 * @author 86150
 */
@Configuration
@MapperScan({"cn.edu.sanda.**.dao"})
public class MybatisplusConfig {
	
	/**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
    	PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    	paginationInterceptor.setDialectType("mysql");
    	return new PaginationInterceptor();
    }
    
    @Bean
    public JsqlParserCountOptimize jsqlParserCountOptimize(){
    	return new JsqlParserCountOptimize();
    }
}
