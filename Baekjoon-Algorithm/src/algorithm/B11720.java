package algorithm;

import java.util.Scanner;

//	숫자의 합
public class B11720 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int sum = 0;
		String line = scanner.next();

		for (int i = 0; i < num; i++) {
			sum += line.charAt(i) - '0';
		}

		System.out.println(sum);
	}
}
