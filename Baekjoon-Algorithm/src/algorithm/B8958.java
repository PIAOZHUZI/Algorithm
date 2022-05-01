package algorithm;

import java.util.Scanner;

//OXÄûÁî

public class B8958 {


	public static void main(String[] args)  throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int [] result = new int[num];
		scanner.nextLine();
		
		String [] c = new String[num];
		for(int i=0; i<num; i++) {
			c[i]=scanner.nextLine();			
		int score=0;
		
		for(int j=0; j<c[i].length(); j++) {
			if(c[i].charAt(j)=='O') {
				score++;
				result[i]+=score;
			}else {
				score=0;
			}
		}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(result[i]);
		}
		
		scanner.close();
	}

}
