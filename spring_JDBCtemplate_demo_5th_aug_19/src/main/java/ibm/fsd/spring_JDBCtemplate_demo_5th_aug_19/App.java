package ibm.fsd.spring_JDBCtemplate_demo_5th_aug_19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ibm.fsd.spring_JDBCtemplate_demo_5th_aug_19.bean.Employees;
import ibm.fsd.spring_JDBCtemplate_demo_5th_aug_19.bean.EmployeesDao;


public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println("hell");
    		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     	     EmployeesDao dao = context.getBean(EmployeesDao.class);
     	      dao.createEmployee(new Employees("tushit","Mishra","tmishra@gg.com"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
}
