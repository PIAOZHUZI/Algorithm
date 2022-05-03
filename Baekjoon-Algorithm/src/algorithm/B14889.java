package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889 {

	static int N;
	static int[][] map;
	static boolean[] visit;
	static int MIN = Integer.MAX_VALUE;
	
	static void dfs(int idx, int depth) {
	
		if(depth == N/2) {
			diff();
			return;
		}
		for(int i=idx; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(i+1, depth+1);
				visit[i] = false;
			}
		}
	}
	//능력치 차이 
	static void diff() {
		int start = 0;
		int link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(visit[i] && visit[j]) {
					start += map[i][j];
					start += map[j][i];
				}else if(!visit[i] && !visit[j]) {
					link += map[i][j];
					link += map[j][i];
					
				}
			}
		}
		
		int absVal = Math.abs(start-link);
		
		if(absVal == 0) {
			System.out.println(absVal);
			System.exit(0);
		}
		MIN = Math.min(absVal, MIN);
		
	}
	
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visit = new boolean[N];
		
		for(int i =0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() + " ");
			
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
		System.out.println(MIN);
	}
	
}
