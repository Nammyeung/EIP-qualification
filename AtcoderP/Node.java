package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Node {
	static int[] parents;
	static List<Integer>[] list;
	static boolean[] visit;
	static int n;

	private static void dfs(int v) {
		visit[v] = true;
		// visit[v] : 부모를 지칭
		for(int i : list[v]) {
			System.out.println(v + "번째 v");
			System.out.println(list[v]);
			System.out.println(i + "번째 i");
			System.out.println(visit[i]);
			if(!visit[i]) {
				parents[i] = v;
				// v가 리스트의 i번째에 들어있는 값의 부모
				System.out.println(i + "의 부모는 : " + parents[i]);
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("노드의 갯수를 입력하시오");
		n = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1]; parents = new int[n+1];
		for(int i = 1 ; i <= n ; i++) list[i] = new ArrayList<>();
		
		visit = new boolean[n+1];
		for(int i = 0 ; i < n-1 ; i++) {
			System.out.println(i+1 + "번째 노드를 입력하시오.");
			String[] tmp = br.readLine().split("\\s");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			list[a].add(b); list[b].add(a);
			System.out.println(a + "번째 " + "list : " + list[a]);
			System.out.println(b + "번째 " + "list : " + list[b]);
		}
		
		dfs(1);
		for(int i = 2 ; i <= n ; i++)  {
		System.out.println("트리 부모 찾기");	
		System.out.println(i + "의 부모는 : " + parents[i]);
		}
	}
}

// https://geehye.github.io/baekjoon-11725/#