package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @Auther DRevelation
 * @Date 2019-07-31 9:58
 * @Desc
 */
public class HibernateTest {
    public static void main(String[] args) {

        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("")
                .build();
        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(null)
                .addAnnotatedClass(null)
                .addResource("")
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(null)
                .build();

        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder()
                .build();
    }
}
