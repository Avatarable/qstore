package com.interswitch.qstoreecrservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource datasource){
        return new JdbcTemplate(datasource);
    }
}
