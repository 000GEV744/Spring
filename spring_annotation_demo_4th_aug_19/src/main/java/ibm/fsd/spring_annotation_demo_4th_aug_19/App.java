package ibm.fsd.spring_annotation_demo_4th_aug_19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ibm.fsd.spring_annotation_demo_4th_aug_19.bean.Employees;
//import ibm.fsd.spring_annotation_demo_4th_aug_19.bean.Coach;
import ibm.fsd.spring_annotation_demo_4th_aug_19.bean.EmployeesDao;
//import ibm.fsd.spring_annotation_demo_4th_aug_19.bean.SwimCoach;


public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println("hell");
//    		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    	       Coach c= context.getBean(SwimCoach.class);
//    	       System.out.println(c.getDailyWorkout());
//    	       System.out.println(c.getDailyFortune());
    		//using data source here and for that we have added dependencies i.e commons-pool, dbcp, and mysql connector
    	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  	      EmployeesDao dao = context.getBean("eDao", EmployeesDao.class);
  	      dao.createEmployee(new Employees("qweret","Gupta","qwbi@gg.com"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
}
