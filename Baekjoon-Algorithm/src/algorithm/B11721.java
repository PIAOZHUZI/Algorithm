package algorithm;

import java.util.Scanner;

//	열 개씩 끊어 출력하기
public class B11721 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			if(i%10==9) {
				System.out.println();
				
			}
		}
	}
}
