package com.MaPetiteNicoise.MaPetiteNicoise.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing()
class DataSourceConfiguration {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username(System.getenv("MPN_db_user"));
        dataSourceBuilder.password(System.getenv("MPN_db_password"));
        dataSourceBuilder.url(System.getenv("MPN_db_url"));
        //MailProperties.setPassword(System.getenv()

        return dataSourceBuilder.build();
    }
}

