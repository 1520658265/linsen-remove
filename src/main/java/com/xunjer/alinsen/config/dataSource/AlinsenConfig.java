package com.xunjer.alinsen.config.dataSource;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @author linsen
 * @date 2020/3/14 22:07
 * @tips 明日复明日 明日何其多
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryAlinsen",
        transactionManagerRef = "transactionManagerAlinsen",
        basePackages = {"com.xunjer.alinsen.repository"})
public class AlinsenConfig {
     @Autowired
     @Qualifier("alinsenDataSource")
     private DataSource alinsenDataSource;

     @Primary
     @Bean(name = "entityManagerAlinsen")
     public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
         return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
     }

     @Primary
     @Bean(name = "entityManagerFactoryAlinsen")
     public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
         return builder
                 .dataSource(alinsenDataSource)
                 .properties(getVendorProperties())
                 .packages("com.xunjer.entity")
                 .persistenceUnit("alinsenPersistenceUnit")
                 .build();
     }

     @Autowired
     private JpaProperties jpaProperties;


     private Map<String, String> getVendorProperties() {
         return jpaProperties.getProperties();
     }

    @Primary
     @Bean(name = "transactionManagerAlinsen")
     public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
         return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
     }
}
