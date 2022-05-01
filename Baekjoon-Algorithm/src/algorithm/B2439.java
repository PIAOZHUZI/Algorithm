package algorithm;

import java.util.Scanner;

//º° Âï±â - 2

public class B2439 {

//  *
// **
//***
//****
//*****
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j =num; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}//end of if
				else {
					System.out.print("*");
				}
			}//end of for j
			System.out.println();
		}
	}
}
