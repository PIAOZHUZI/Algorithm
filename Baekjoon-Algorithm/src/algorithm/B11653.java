package algorithm;

import java.util.Scanner;

//���μ����� 

public class B11653 {

	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =2; i*i <=n; i++){
            while (n%i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}
