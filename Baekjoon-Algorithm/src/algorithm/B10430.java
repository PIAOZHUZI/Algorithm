package algorithm;

import java.util.Scanner;

//나머지 

public class B10430 {

	public static void main(String[] args) {
		// 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C,
		// 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

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
