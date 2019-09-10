package ibm.fsd.spring_annotation_demo_4th_aug_19.bean;

import org.springframework.stereotype.Component;

@Component
public class FortuneServices {

	public String getFortune() {
		return "not a lucky day";
		
	}
}
