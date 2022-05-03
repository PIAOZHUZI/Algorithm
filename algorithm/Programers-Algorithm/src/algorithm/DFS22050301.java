package algorithm;

import java.util.ArrayList;
import java.util.Collections;

//여행경로
public class DFS22050301 {

	 static boolean[] visit;
	 static ArrayList<String> allRoute;
	    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        visit = new boolean[tickets.length];
        allRoute = new ArrayList<String>();
        
        dfs("ICN","ICN",tickets,0);
        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        return answer;
    }
    
    public static void dfs(String s, String r, String[][] tickets, int depth){
        if(depth == tickets.length){
            allRoute.add(r);
            return;
        }
        for(int i =0; i<tickets.length; i++){
            if(s.equals(tickets[i][0]) && !visit[i]){
                visit[i] = true;
                dfs(tickets[i][1], r+" "+tickets[i][1], tickets, depth+1);
                visit[i] = false;
            }
        }
    }
}
