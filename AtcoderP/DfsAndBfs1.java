package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DfsAndBfs1 {
	
	static int map[][];
	static boolean[] visit;
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static int n,m,v;
	static int count = 1;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.print("출력 " + count + ": " + i + " ");
		count += 1;
		TreeMap<Integer, Integer> tmp = arrayList.get(i);
		System.out.println(tmp);
		System.out.println(tmp.keySet());
		System.out.println(tmp.values());
		for(int j : tmp.keySet()) {
			if(visit[j] == false ) {
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		// 방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요.
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.println(temp);
			System.out.print(temp + " ");
			
			for(int k = 1 ; k <= n ; k++) {
				if(map[temp][k] == 1 && visit[k] == false) {
					q.offer(k);
					visit[k] = true;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
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
		arrayList = new ArrayList<>();
		System.out.println(arrayList);
		for(int j = 0 ; j < n+1 ; j++) {
			Arrays.fill(map[j],  0);
			arrayList.add(new TreeMap<Integer, Integer>());
		}
		System.out.println(arrayList);
		Arrays.fill(visit, false);
		for(int i = 0 ; i < m ; i++) {
			
			System.out.println();
			System.out.print("간선이 연결하고 있는 두 정점을 입력하세요 : ");
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge, " ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
			arrayList.get(a).put(b, a);
			arrayList.get(b).put(a, b);
			System.out.println();
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
			
		}System.out.println();
		System.out.println(arrayList);
		System.out.println("깊이 우선 탐색(Dfs) 시행");
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		System.out.println("넓이 우선 탐색(Bfs) 시행");
		bfs(v);
		
	}

}
