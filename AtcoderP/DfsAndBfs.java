package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//****************************������ķ� ����*************************************
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
// ���� ã�� ��ΰ� ���࿡ �ٸ� ��ΰ� ������ �ٷ� ���� ������ �̵���Ű�� ���࿡ ������, �ٽ� ��Ŀ�ؼ� ���ƿ��� �����.

			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		System.out.println(q);
		visit[i] = true;
		// �湮�� ��ġ�� �˾ƾ��ϴϱ�, �װ��� üũ�ϱ� ���ؼ�(true) visit�� �ʿ�.
		while(!q.isEmpty()) {
			int temp = q.poll();
			// ù��° �湮�� ��ġ�� ���ֱ�� �Ѵ�.
			System.out.println(temp);
			System.out.print(temp + " ");
			
			for(int k = 1 ; k <= n ; k++) {
				if(map[temp][k] == 1 && visit[k] == false) {
					q.offer(k);
					visit[k] = true;
					// true��� �湮�� �Ѱ���.
				}
			}
		System.out.println();
		System.out.println("Queues : " + q);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ����(n), ������ ����(m), Ž���� ������ ������ ��ȣ(v)�� ���ʷ� �Է��Ͻÿ�(���� ����) : ");
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
		System.out.print("������ �����ϰ� �ִ� �� ������ �Է��ϼ��� : ");
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
		System.out.println("���� �켱 Ž��(Dfs) ����");
		dfs(v);
		System.out.println();
		Arrays.fill(visit,  false);
		System.out.println();
		System.out.println("���� �켱 Ž��(Bfs) ����");
		bfs(v);
	
		}		
	}

