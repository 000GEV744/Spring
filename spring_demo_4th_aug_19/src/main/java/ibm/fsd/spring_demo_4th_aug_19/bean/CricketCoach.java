package ibm.fsd.spring_demo_4th_aug_19.bean;

public class CricketCoach implements Coach {

	private FortuneServices fortuneService;
	private String email;
	private String teamName;
	
	
	
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

	public FortuneServices getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		super();
	}

	public CricketCoach(FortuneServices fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

	public String getDailyWorkout() {
		
		return "run for 5Km today "+getEmail()+" "+getTeamName();
	}

	
	public String getFortuneServices() {
		return fortuneService.getFortune();
	}
	
	public void initializeMethod() {
		System.out.println("hello Coach-> ravi Shastri");
	}
	
	public void destroyMethod() {
		System.out.println("no coach is assigned");
	}
}
