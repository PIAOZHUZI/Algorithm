package algorithm;

import java.util.Scanner;

//������ 

public class B10430 {

	public static void main(String[] args) {
		// ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C,
		// ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();

		b = scanner.nextInt();

		c = scanner.nextInt();

		System.out.println((a + b) % c);

		System.out.println((a % c + b % c) % c);

		System.out.println((a * b) % c);

		System.out.println((a % c * b % c) % c);

	}
}
