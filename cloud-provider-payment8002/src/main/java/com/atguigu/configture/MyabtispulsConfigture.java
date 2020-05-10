package com.atguigu.configture;

import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyabtispulsConfigture  {
     @Bean
    public SqlSessionFactory sqlSessionFactory( DataSource dataSource, MybatisProperties properties) throws Exception {
         MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
         sessionFactoryBean.setMapperLocations(properties.resolveMapperLocations());
         sessionFactoryBean.setDataSource(dataSource);
         return sessionFactoryBean.getObject();
     }

}
