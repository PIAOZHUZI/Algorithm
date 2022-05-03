package algorithm;
import java.util.*;

//피로도 - JAVA

public class Back22050302 {
	public boolean[] visit;
    public  int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }
    private void dfs(int depth, int k, int[][] d){
        for(int i=0; i<d.length; i++){
            if(!visit[i] && d[i][0] <=k){
                visit[i] = true;
                dfs(depth+1, k-d[i][1] , d);
                visit[i] = false;
            }
        }
        answer =Math.max(answer, depth);
    }
}
