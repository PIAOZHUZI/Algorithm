package algorithm;
import java.util.*;

public class Stack22050301 {
	public int solution(String s) {
	    int answer = 0;
	    String copy = s;
	    for(int i=0; i<s.length(); i++) {
	    	  if(checkString(copy)) answer++;
	            copy = copy.substring(1, s.length()) + copy.charAt(0);
	    }
	    return answer;
 	}
	
	public static boolean checkString(String s) {
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			try {
				switch (s.charAt(i)) {
					case '[': {
						st.add('[');
						break;
					}
					case ']': {
						if(st.peek() != '[') {
							return false;
						}
						st.pop();
						break;
					}
					case '{': {
						st.add('{');
						break;
					}
					case '}': {
						if(st.peek() != '{') {
							return false;
						}
						st.pop();
						break;
					}
					case '(': {
						st.add('(');
						break;
					}
					case ')': {
						if(st.peek() != '(') {
							return false;
						}
						st.pop();
						break;
					}
				}
			} catch (Exception e) {
				return false;
			}
		}
		return st.isEmpty() ? true:false;
	}
	
}
