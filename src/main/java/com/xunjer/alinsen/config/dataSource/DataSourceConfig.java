package com.xunjer.alinsen.config.dataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Map;


/**
 * @author linsen
 * @date 2020/3/14 22:06
 * @tips 明日复明日 明日何其多
 */
@Configuration
public class DataSourceConfig {

    @Resource
    private JpaProperties jpaProperties;
    @Resource
    private HibernateProperties hibernateProperties;

    @Bean(name = "alinsenDataSource")
    @Qualifier("alinsenDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.alinsen")
    public DataSource alinsenDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 配置 组合jpaProperties和hibernateProperties配置的map对象
     * @return 组合jpaProperties和hibernateProperties配置的map
     */
    @Bean(name = "vendorProperties")
    public Map<String, Object> getVendorProperties() {
        return hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
    }
}
