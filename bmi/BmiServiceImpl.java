package bmi;

public class BmiServiceImpl implements BmiService{

	public double calcBmi(BmiDTO bmi) {
		return bmi.getWeight() / bmi.getHeight() / bmi.getHeight() * 10000;
	}

}
