package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Node{
    int x, y;
    int cnt;
    Node(int x, int y,int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
public class B2589 {
    static int N,M;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    static boolean visit[][];
    static char arr[][];

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
       // visit = new boolean[N][M];

        for(int i =0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j);

            }
        }
        int result = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 'L'){
                    visit = new boolean[N][M];
                    int len = bfs(i,j);
                    result = Math.max(result,len);
                }
            }
        }
        System.out.println(result);
    }

    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y,0));
        visit[x][y] = true;
        int r = 0;
        while(!q.isEmpty()){
            Node n = q.poll();
            for(int i=0; i<4; i++){
                int cx = n.x + dx[i];
                int cy = n.y + dy[i];
                if(cx>=0 && cx<N && cy>=0 && cy<M && !visit[cx][cy] && arr[cx][cy] == 'L'){
                    visit[cx][cy] = true;
                    q.offer(new Node(cx,cy,n.cnt+1));
                    r = Math.max(r,n.cnt+1);
                }
            }
        }
        return r;
    }

    
}
