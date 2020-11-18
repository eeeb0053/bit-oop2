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
		
		System.out.print("0. ���� 1. ���� 2. BMI >> ");
		
		switch(scanner.next()){
		case "1" :
			System.out.println("���� ����");
			System.out.print("����1 : ");
			cal.setNum1(scanner.nextInt());
			System.out.print("������ +, -, *, /, % : ");
			cal.setOpcode(scanner.next());
			System.out.print("����2 : ");
			cal.setNum2(scanner.nextInt());
			System.out.println("��: "+controller.execute(cal));
			break;
		case "2" :
			System.out.println("BMI ��� ����");
			System.out.print("�̸�: ");
			user.setName(scanner.next());
			System.out.print("Ű: ");
			bmi.setHeight(scanner.nextDouble());
			System.out.print("������: ");
			bmi.setWeight(scanner.nextDouble());
			System.out.println(controller.getBmi(user, bmi));
			break;
		case "0" :
			System.out.println("�ý��� ����");
			break;
		}
		
		scanner.close();
	}
}

