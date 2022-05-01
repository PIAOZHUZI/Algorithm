package algorithm;

import java.util.Scanner;

//숫자의 개수

public class B2577 {


	public static void main(String[] args)  throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int d = a*b*c;
		int [] r= new  int[10];
		for(int result = d; result>0; result/=10) {
			//System.out.println(result);
			r[result%10]++;
			
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(r[i]);
		}
	}

}
