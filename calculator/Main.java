package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO cal = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		System.out.println("���� ����");
		System.out.print("����1 : ");
		cal.setNum1(scanner.nextInt());
		System.out.print("������ +, -, *, /, % : ");
		cal.setOpcode(scanner.next());
		System.out.print("����2 : ");
		cal.setNum2(scanner.nextInt());
		
		System.out.println("��: "+controller.execute(cal));
		
		scanner.close();
	}
}