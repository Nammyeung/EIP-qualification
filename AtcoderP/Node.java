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
		// visit[v] : �θ� ��Ī
		for(int i : list[v]) {
			System.out.println(v + "��° v");
			System.out.println(list[v]);
			System.out.println(i + "��° i");
			System.out.println(visit[i]);
			if(!visit[i]) {
				parents[i] = v;
				// v�� ����Ʈ�� i��°�� ����ִ� ���� �θ�
				System.out.println(i + "�� �θ�� : " + parents[i]);
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("����� ������ �Է��Ͻÿ�");
		n = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1]; parents = new int[n+1];
		for(int i = 1 ; i <= n ; i++) list[i] = new ArrayList<>();
		
		visit = new boolean[n+1];
		for(int i = 0 ; i < n-1 ; i++) {
			System.out.println(i+1 + "��° ��带 �Է��Ͻÿ�.");
			String[] tmp = br.readLine().split("\\s");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			list[a].add(b); list[b].add(a);
			System.out.println(a + "��° " + "list : " + list[a]);
			System.out.println(b + "��° " + "list : " + list[b]);
		}
		
		dfs(1);
		for(int i = 2 ; i <= n ; i++)  {
		System.out.println("Ʈ�� �θ� ã��");	
		System.out.println(i + "�� �θ�� : " + parents[i]);
		}
	}
}

// https://geehye.github.io/baekjoon-11725/#