package bmi;

import user.UserDTO;

public class BmiController {
	public String getBmi(UserDTO user, BmiDTO bmi) {
		return String.format("%s님의 BMI 지수는 %.2f 입니다.", user.getName(), new BmiServiceImpl().calcBmi(bmi));
	}
}
