package calculator;

public class CalculatorServiceImpl implements CalculatorService{

	public int add(CalculatorDTO cal) {
		return cal.getNum1() + cal.getNum2();
	}

	public int minus(CalculatorDTO cal) {
		return cal.getNum1() - cal.getNum2();
	}

	public int multi(CalculatorDTO cal) {
		return cal.getNum1() * cal.getNum2();
	}

	public int divid(CalculatorDTO cal) {
		return cal.getNum1() / cal.getNum2();
	}
	
	public int modul(CalculatorDTO cal) {
		return cal.getNum1() % cal.getNum2();
	}
}
