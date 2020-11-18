package calculator;

import bmi.*;
import user.*;

public class CalculatorController {
	public int execute(CalculatorDTO cal) {
		CalculatorService service = new CalculatorServiceImpl();
		int res = 0;
		String op = cal.getOpcode();
		if(op.equals("+")) {
			res = service.add(cal);
		}else if(op.equals("-")) {
			res = service.minus(cal);
		}else if(op.equals("*")) {
			res = service.multi(cal);
		}else if(op.equals("/")) {
			res = service.divid(cal);
		}else if(op.equals("%")) {
			res = service.modul(cal);
		}
		return res;
	}
	
	public String getBmi(UserDTO user, BmiDTO bmi) {
		return String.format("%s님의 BMI 지수는 %.2f 입니다.", user.getName(), new BmiServiceImpl().calcBmi(bmi));
	}
}
