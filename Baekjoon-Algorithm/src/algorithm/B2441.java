package algorithm;

import java.util.Scanner;

//º° Âï±â - 4

public class B2441 {

//	*****
//	1****
//	12***
//	123**
//	1234*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
