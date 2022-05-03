package algorithm;
import java.util.*;

public class BFS22050301 {

	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	static boolean[][] visit;
	static int N,M;
	
	public int solution(int[][] maps) {
        int answer = -1;
        N = maps.length;
        M = maps[0].length;
        visit = new boolean[N][M];
        answer = bfs(0,0,maps);
        return answer;
    }
	 
	public static int bfs(int x, int y, int[][] m) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y,1));
		visit[x][y] = true;
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n.x == N-1 && n.y == M -1 ) {
				return n.cost;
			}
			for(int i=0; i<4; i++) {
				int cx = n.x+dx[i];
				int cy = n.y+dy[i];
				
				if(cx>=0 && cy >=0 && cx<N && cy<M) {
					if(m[cx][cy] == 1 && !visit[cx][cy]) {
						visit[cx][cy] = true;
						q.offer(new Node(cx,cy,n.cost+1));
					}
				}
			}
		}
		return -1;
	}
	
	public static class Node{
		int x;
		int y;
		int cost;
		
		public Node(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
	}
	
	 
}
