package com.atguigu.configture;

import com.atguigu.entities.Payment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

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
