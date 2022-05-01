package algorithm;

import java.util.Scanner;
//test
	public class B1001 {
	//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		public static void main(String[] args) {
			
		 
			int a, b = 0;
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();

			System.out.printf("%d\n", a - b);

		}
}
