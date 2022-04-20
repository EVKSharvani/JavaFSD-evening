package com.simplillearn;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil2 {

	private static SessionFactory sessionFactory;
	
	static {
		
			
			StandardServiceRegistry registry= new StandardServiceRegistryBuilder().
					configure("hibernatefare.cfg.xml").build();
			
			Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
			
			sessionFactory= metadata.getSessionFactoryBuilder().build();
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}