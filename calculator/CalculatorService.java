package calculator;

public class CalculatorService {
	int add(CalculatorDTO cal) {
		return cal.getNum1() + cal.getNum2();
	}
	int minus(CalculatorDTO cal) {
		return cal.getNum1() - cal.getNum2();
	}
	int multi(CalculatorDTO cal) {
		return cal.getNum1() * cal.getNum2();
	}
	int divide(CalculatorDTO cal) {
		return cal.getNum1() / cal.getNum2();
	}
	int modul(CalculatorDTO cal) {
		return cal.getNum1() % cal.getNum2();
	}
}
