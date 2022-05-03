package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {

	static boolean[][] map;
	static int MIN = 64;
	static int N,M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				if(str.charAt(j) == 'W') {
					map[i][j] = true; // W
				}else {
					map[i][j] = false; // B
				}
			}
		}
		
		int N_R = N-7;
		int N_C = M-7;
		
		for(int i=0; i<N_R; i++) {
			for(int j=0; j<N_C; j++) {
				find(i,j);
			}
		}
		System.out.println(MIN);
		
	}
	
	public static void find(int x, int y) {
		int E_X = x+8;
		int E_Y = y+8;
		int count = 0;
		
		boolean first = map[x][y];
		
		
		for(int i=x; i<E_X; i++) {
			for(int j=y; j<E_Y; j++) {
				if(map[i][j] != first) {
					count ++;
				}
				
				first = (!first);
			}
			first = !first;
		}
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		MIN = Math.min(MIN, count);
	}
}
