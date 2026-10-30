package code;

import java.util.Scanner;

public class CodeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take input from users till they press x or X
		int ans = 0;
		while (true) {
			// taking the operators as input
			System.out.println("Enter the opration you want to do");
			char operation = sc.next().trim().charAt(0);

			if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
				// Input two numbers
				System.out.println("Enter the first number");
				int num1 = sc.nextInt();
				System.out.println("Enter the second number");
				int num2 = sc.nextInt();

				if (operation == '+') {
					ans = num1 + num2;
				}

				if (operation == '-') {
					ans = num1 - num2;
				}
				if (operation == '*') {
					ans = num1 * num2;
				}
				if (operation == '/') {
					if (num2 != 0) {
						ans = num1 / num2;
					}
				}
				if (operation == '%') {
					ans = num1 % num2;
				}

			} else if (operation == 'x' || operation == 'X') {
				break;
			} else {
				System.out.println("Invalid operation request");
			}

			System.out.println(ans);
		}
		
	}

}
