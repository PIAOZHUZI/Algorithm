package algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

//���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

public class B1152 {
	public static void main(String[] args) {

		try {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//System.out.println(input.toString());
		StringTokenizer st = new StringTokenizer(input, " ");
		System.out.println(st.countTokens());
		
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}
