package algorithm;

import java.util.Scanner;

//��Ģ����

public class B10869 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b = 0;
		// ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B,
		// ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
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
