package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO cal = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		System.out.println("계산기 시작");
		System.out.print("숫자1 : ");
		cal.setNum1(scanner.nextInt());
		System.out.print("연산자 +, -, *, /, % : ");
		cal.setOpcode(scanner.next());
		System.out.print("숫자2 : ");
		cal.setNum2(scanner.nextInt());
		
		System.out.println("답: "+controller.execute(cal));
		
		scanner.close();
	}
}