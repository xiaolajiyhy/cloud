package com.atguigu.configture;

import com.atguigu.entities.Payment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyabtispulsConfigture  {
     @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
         return  new MybatisSqlSessionFactoryBean().getObject() ;
     }


}
