package algorithm;

import java.util.Scanner;

//사칙연산

public class B10869 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b = 0;
		// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B,
		// 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		a = scanner.nextInt();
		b = scanner.nextInt();

		double c = (double) a / b;
		System.out.println(a + b);

		System.out.println(a - b);

		System.out.println(a * b);

		System.out.println(a/b);

		System.out.println(a % b);

	}
}
