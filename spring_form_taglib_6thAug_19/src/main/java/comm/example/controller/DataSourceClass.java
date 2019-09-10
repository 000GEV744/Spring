package comm.example.controller;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:sql.properties")
@Component
public class DataSourceClass extends BasicDataSource {

	@PostConstruct
	public void setDataSource() {
		this.setUrl("${DBurl}");
		this.setUsername("${DBusername}");
		this.setPassword("${DBpassword}");
	}
}
