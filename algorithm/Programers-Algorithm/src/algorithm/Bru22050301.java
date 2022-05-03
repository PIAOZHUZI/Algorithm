package algorithm;

import java.util.HashSet;

public class Bru22050301 {
	static int row,col;
	static String[][] table;
	static HashSet<HashSet<Integer>> candidate;
	
	public int solution(String[][] relation) {
	    int answer = 0;
	    row = relation.length;
	    col = relation[0].length;
	    table = relation;
	    candidate = new HashSet<HashSet<Integer>>();

	    for (int pick = 1; pick <= col; pick++) {
	      getKeySet(0, pick, new HashSet<Integer>());
	    }
	    
	    answer = candidate.size();
	    
	    return answer;
	}
	
	public static void getKeySet(int start, int pick, HashSet<Integer>set) {
		if(pick ==0) {
			if(!isUnique(set)) {
				return;
			}
			for(HashSet<Integer> part : candidate) {
				HashSet<Integer> temp  = new HashSet<>(part);
				temp.removeAll(set);
				
				if(temp.size()==0) {
					return;
				}
			}
			candidate.add(set);
			return;
		}
		for(int i=start; i<col; i++) {
			HashSet<Integer> newSet = new HashSet<Integer>(set);
			newSet.add(i);
			getKeySet(i+1, pick-1, newSet);
		}
	}
	
	public static boolean isUnique(HashSet<Integer> set) {
		HashSet<String> result = new HashSet<String>();
		
		for(String [] row : table) {
			String value =" ";
			for(Integer idx : set) {
				value +=row[idx];
			}
			
			if(!result.add(value)) {
				return false;
			}
		}
		return true;
	}
}
