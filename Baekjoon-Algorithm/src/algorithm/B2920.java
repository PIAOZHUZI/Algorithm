package algorithm;

import java.util.Scanner;

//À½°è

public class B2920 {

	public static void main(String[] args)  throws Exception{
		  Scanner sc = new Scanner(System.in);

		  String asc ="1 2 3 4 5 6 7 8";
		  String desc = "8 7 6 5 4 3 2 1";
	
		  String input = sc.nextLine();
		  
		  if(input.equals(asc)) {
			  System.out.println("ascending");
		  }else if(input.equals(desc)) {
			  System.out.println("descending");
		  }
		  else {
			  System.out.println("mixed");
		  }
		  sc.close();
	}
}
