package com.ajudarobotica.escola;

import java.sql.DriverManager;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
public class Configuration {
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234");
        return dataSource;
    }
}
