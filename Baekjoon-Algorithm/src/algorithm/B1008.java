package algorithm;
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class B1008 {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int a , b=0;
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		double c = (double)a/b;
		System.out.println(c);

	}
}
