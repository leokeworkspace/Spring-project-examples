package com.leo.SpringBoot2.configuration.dataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;
/*
 * 配置多個資料庫
 * 
 */
//@Configuration
public class DataSource {

//	@Bean
//	//默认数据源
//	@Primary
//	//将properties中以mysql为前缀的参数值，写入方法返回的对象中
//	@ConfigurationProperties(prefix="mysql")
//	public HikariDataSource mysqDataSource() {
//		//通过DataSourceBuilder构建数据源
//		return DataSourceBuilder.create().type(HikariDataSource.class).build();
//	}
//	
//	@Bean
//	//第二個之後的資料庫需要配置@Qualifier
//	@Qualifier("oracle")
//	@ConfigurationProperties(prefix="oracle")
//	public HikariDataSource oracleDataSource() {
//		return DataSourceBuilder.create().type(HikariDataSource.class).build();
//	}

}
