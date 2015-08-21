package com.world101.projname.web.front;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.world101.projname.web.front.repositories")
@ComponentScan(basePackages = { "com.world101.projname" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

		EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
		adapter.setGenerateDdl(true);
		adapter.setShowSql(true);
		adapter.setDatabase(Database.MYSQL);

		emfb.setJpaVendorAdapter(adapter);
		emfb.setDataSource(dataSource);
		emfb.setPackagesToScan("com.world101.projname.web.front.dto");

		Properties jpaProperties = new Properties();
//		jpaProperties.put("hibernate.hbm2ddl.auto", "create");
		jpaProperties.put("eclipselink.weaving", "false");
		emfb.setJpaProperties(jpaProperties);

		return emfb;
	}

	@Bean
	public JpaTransactionManager transactionManager(
			LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
		EntityManagerFactory factory = entityManagerFactoryBean.getObject();
		return new JpaTransactionManager(factory);
	}

	@Bean
	public JndiObjectFactoryBean jndiDataSource() {
		JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
		jndiObjectFB.setJndiName("jdbc/world101");
		jndiObjectFB.setResourceRef(true);
		jndiObjectFB.setProxyInterface(javax.sql.DataSource.class);
		return jndiObjectFB;
	}
}
