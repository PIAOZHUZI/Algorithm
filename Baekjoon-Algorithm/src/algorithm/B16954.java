package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class B16954 {

    static char[][] map = new char[8][8];
    static Queue<Dot>  q = new ArrayDeque<>();

    static int[] dx = {-1,0,1,-1,0,1,-1,0,1};
    static int[] dy = {-1,-1,-1,0,0,0,1,1,1};

    static boolean flag = false;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<8; i++){
            map[i] = br.readLine().toCharArray();

        }
        q.offer(new Dot(7,0));

        while(!q.isEmpty() && !flag){
            bfs();
            moveWall();
        }

        if(flag){
            bw.write("1");
        }else{
            bw.write("0");
        }

        bw.close();;
        br.close();
    }

    static class Dot{
        int x,y;
    
        Dot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(){
        int size = q.size();

        for(int i=0; i<size; i++){
            if(flag){
                return;
            }
            Dot cur = q.poll();

            if(map[cur.x][cur.y] == '#'){
                continue;
            }

            if(cur.x == 0  && cur.y == 7){
                flag = true;
                return;
            }

            for(int j=0; j<9; j++){
                int cx = cur.x + dx[j];
                int cy = cur.y + dy[j];

                if(cx>= 0 && cx<8 && cy>=0 && cy<8 && map[cx][cy] == '.'){
                    q.offer(new Dot(cx,cy));
                }
            }
        }
    }

    static void moveWall(){
        for(int i =0; i<7; i++){
            map[7][i] = '.';
        }

        for(int i = 6; i>=0; i--){
            for(int j = 0; j<8; j++){
                if(map[i][j] == '#'){
                    map[i+1][j] = '#';
                    map[i][j] = '.';
                }
            }
        }
    }

}
