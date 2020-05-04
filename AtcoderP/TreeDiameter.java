package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Node {
	int node, dist;
	public Node(int node, int dist) {
		this.node = node;
		this.dist = dist;
	}
}
public class TreeDiameter {
	static List<Node>[] list;
	static boolean[] visit;
	static Node maxNode;
	static int max = 0, n;
	// DFS(Depth-first search)
	private static Node dfs(Node v, int dist) {
		visit[v.node]= true;
//		System.out.println(v.node + "��° visit : " + visit);
		
		for(Node tmp : list[v.node]) {
			if(!visit[tmp.node]) dfs(tmp, dist + tmp.dist);
			System.out.println("v.node��° : " + v.node);
			System.out.println("dist : " + dist);
			System.out.println("tmp.dist : " + tmp.dist);
			System.out.println("dist + tmp.dist : " + ((int)dist + (int)tmp.dist));
//			System.out.println("dfs(" + tmp + "," + "dist+tmp.dist" + ") :" + dfs(tmp,dist+tmp.dist));
		}
		
		if(max < dist) {
			maxNode = v; max = dist;
		}
		
		return maxNode;
	}	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Node�� ������ �Է��Ͻÿ�(Node Ŭ������ ����) : ");
		Node maxx; n = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1]; visit = new boolean[n+1];
		for(int i = 0 ; i <= n ; i++) list[i] = new ArrayList<>();
		
		list[0].add(new Node(1, 0));
		for(int i = 0 ; i < n-1 ; i++) {
			System.out.println(i+1 + "��° ��带 �Է��Ͻÿ�.");
			String[] tmp = br.readLine().split("\\s");
			int a = Integer.parseInt(tmp[0]), b = Integer.parseInt(tmp[1]),
			c = Integer.parseInt(tmp[2]);
			
		list[a].add(new Node(b, c));
		list[b].add(new Node(a, c));
		System.out.println(a + "�θ��� �ڽĳ��(����� ����)�� : " + b + " �� " + c);
		System.out.println(b + "�θ��� �ڽĳ��(����� ����)�� : " + a + " �� " + c);
		for(int j = 3 ; j < tmp.length ; j+= 2) {
			System.out.println(j + "��°");
			if(tmp[j].equals("-1")) break;
			b = Integer.parseInt(tmp[j]); c = Integer.parseInt(tmp[j+1]);
			list[a].add(new Node(b, c)); list[b].add(new Node(a, c));
			System.out.println(a + "�θ��� �ڽĳ��� : " + b + " �� " + c);
			System.out.println(b + "�θ��� �ڽĳ��� : " + a + " �� " + c);
			}
		}
		
		System.out.println("list[0] : " + list[0]);
		System.out.println("list[0].get(0) : " + list[0].get(0));
		maxx = dfs(list[0].get(0), 0); visit = new boolean[n+1]; maxNode = null; max = 0;
		System.out.println(maxx);
		dfs(maxx, 0);
		System.out.println(max);
		
	}

}
