package ibm.fsd.spring_annotation_demo_4th_aug_19.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	@Value("The Spirit team")
	private String teamName;
	@Autowired
	private FortuneServices fortuneServices;
	
	public SwimCoach() {
		super();
	}

	

	public SwimCoach(String email, String teamName) {
		super();
		this.email = email;
		this.teamName = teamName;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public FortuneServices getFortuneServices() {
		return fortuneServices;
	}

	
	public String getDailyWorkout() {
		
		return "test workout"+email+teamName;
	}

	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}
	@PostConstruct
	public void setWaterLevel()
	{
		System.out.println("make water level high.");
	}
	@PreDestroy
	public void destroySwim()
	{
		System.out.println("pre destroy called..");
	}

}
