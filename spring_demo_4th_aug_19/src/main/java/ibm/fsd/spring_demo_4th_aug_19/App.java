package ibm.fsd.spring_demo_4th_aug_19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ibm.fsd.spring_demo_4th_aug_19.bean.Coach;
import ibm.fsd.spring_demo_4th_aug_19.bean.CricketCoach;
import ibm.fsd.spring_demo_4th_aug_19.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     try {
		
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	 Coach theCoach=context.getBean("theCoach", Coach.class);
     	 System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getFortuneServices());
         context.close();

//    	 Employee e = context.getBean("theEmployee", Employee.class);
//    	 System.out.println(e.toString());
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}
