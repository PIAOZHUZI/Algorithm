package algorithm;

import java.util.Scanner;

//Æò±Õ Á¡¼ö
public class B10039 {

	public static void main(String[] args)  throws Exception{
		  Scanner sc = new Scanner(System.in);

		  int [] num = new int [5];
		  for(int i=0; i<5; i++) {
			  num[i]=sc.nextInt();
		  }
		  int avg=0;
		  for(int i=0; i<5; i++)
		  {
			  if(num[i]<40) {
				  avg+=40;
			  }else {
				  avg+=num[i];
			  }
		  }
		  avg=avg/5;
		  System.out.println(avg);
	}
}
