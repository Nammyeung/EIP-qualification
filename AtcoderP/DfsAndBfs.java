package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//****************************인접행렬로 구현*************************************
public class DfsAndBfs {
	static int map[][];
	static boolean[] visit;
	static int n,m,v;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.print(i + " ");
		for(int j = 1 ; j < n+1 ; j++) {
			if(map[i][j] == 1 && visit[j] == false) {
				System.out.println(j + " ");
				dfs(j); 
// 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면, 다시 리커해서 돌아오는 방식임.

			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		System.out.println(q);
		visit[i] = true;
		// 방문한 위치는 알아야하니까, 그것을 체크하기 위해서(true) visit이 필요.
		while(!q.isEmpty()) {
			int temp = q.poll();
			// 첫번째 방문한 위치는 빼주기로 한다.
			System.out.println(temp);
			System.out.print(temp + " ");
			
			for(int k = 1 ; k <= n ; k++) {
				if(map[temp][k] == 1 && visit[k] == false) {
					q.offer(k);
					visit[k] = true;
					// true라면 방문을 한거임.
				}
			}
		System.out.println();
		System.out.println("Queues : " + q);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정점의 갯수(n), 간선의 갯수(m), 탐색을 시작할 정점의 번호(v)를 차례로 입력하시오(띄어쓰기 구분) : ");
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		for(int t = 0 ; t < n+1 ; t++) {
			System.out.print(" " + t + " ");
		}
		for(int j = 0 ; j < n+1 ; j++) {
			Arrays.fill(map[j],0);
			System.out.println();
			System.out.print(j);
			for(int i = 0 ; i < n+1 ; i++) {
			System.out.print("[" + map[j][i] + "]");
			}
	}
	Arrays.fill(visit,  false);
	for(int i = 0 ; i < m ; i++) {
		System.out.println();
		System.out.print("간선이 연결하고 있는 두 정점을 입력하세요 : ");
		String edge = br.readLine();
		StringTokenizer st1 = new StringTokenizer(edge, " ");
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		map[a][b] = 1;
		map[b][a] = 1;
	}
		for(int t = 0 ; t < n+1 ; t++) {
			System.out.print(" " + t + " ");
			}
		for(int j = 0 ; j < n+1 ; j++) {
			System.out.println();
			System.out.print(j);
			for(int k = 0 ; k < n+1 ; k++) {
				System.out.print("[" + map[j][k] + "]");
			}
		}
		System.out.println();
		System.out.println("깊이 우선 탐색(Dfs) 시행");
		dfs(v);
		System.out.println();
		Arrays.fill(visit,  false);
		System.out.println();
		System.out.println("넓이 우선 탐색(Bfs) 시행");
		bfs(v);
	
		}		
	}

