package comm.example.controller.factory;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:sql.properties")
@Component
public class DataSourceClass extends BasicDataSource {

	@PostConstruct
	public void setDataSource() {
		this.setUrl("jdbc:mysql://localhost:3306/mydb");
		this.setUsername("root");
		this.setPassword("27-Feb-2019");
	}
}
