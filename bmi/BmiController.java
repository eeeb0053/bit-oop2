package bmi;

import user.UserDTO;

public class BmiController {
	public String getBmi(UserDTO user, BmiDTO bmi) {
		return String.format("%s���� BMI ������ %.2f �Դϴ�.", user.getName(), new BmiServiceImpl().calcBmi(bmi));
	}
}
