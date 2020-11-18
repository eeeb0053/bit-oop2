package viewer;

import java.util.Scanner;

import bmi.*;
import calculator.*;
import user.UserDTO;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO cal = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		BmiDTO bmi = new BmiDTO();
		UserDTO user = new UserDTO();
		
		System.out.print("0. 종료 1. 계산기 2. BMI >> ");
		
		switch(scanner.next()){
		case "1" :
			System.out.println("계산기 시작");
			System.out.print("숫자1 : ");
			cal.setNum1(scanner.nextInt());
			System.out.print("연산자 +, -, *, /, % : ");
			cal.setOpcode(scanner.next());
			System.out.print("숫자2 : ");
			cal.setNum2(scanner.nextInt());
			System.out.println("답: "+controller.execute(cal));
			break;
		case "2" :
			System.out.println("BMI 계산 시작");
			System.out.print("이름: ");
			user.setName(scanner.next());
			System.out.print("키: ");
			bmi.setHeight(scanner.nextDouble());
			System.out.print("몸무게: ");
			bmi.setWeight(scanner.nextDouble());
			System.out.println(controller.getBmi(user, bmi));
			break;
		case "0" :
			System.out.println("시스템 종료");
			break;
		}
		
		scanner.close();
	}
}

