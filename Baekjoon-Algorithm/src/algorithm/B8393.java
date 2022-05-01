package algorithm;

import java.util.Scanner;

//гу
public class B8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
