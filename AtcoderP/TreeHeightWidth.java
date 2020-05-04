package AtcoderP;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TreeHeightWidth {
	
	static class Node1 {
		int parent;
		int num;
		int left;
		int right;
		
		Node1 (int num, int left, int right) {
			this.parent = -1;
			this.num = num;
			this.left = left;
			this.right = right;
		}
	}
	
	static int[] levelMin;
	static int[] levelMax;
	static int point = 1;
	//point : ���� x��ǥ (��带 �湮�� ������ +1 ����)
	static List<Node1> tree = new ArrayList<>();
	static int maxLevel = 0; // Ʈ���� �ִ� ����(����)
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����� ������ �Է��Ͻÿ� :");
		int n = Integer.parseInt(br.readLine());
		levelMin = new int[n+1];
		levelMax = new int[n+1];
		int rootIndex = 0;
		for(int i = 0 ; i <= n ; i++) {
			tree.add(new Node1(i, -1, -1));
			System.out.println(i+1 + "��° : " + tree.get(i));
			levelMin[i] = n;
			System.out.println("levelMin[" + i + "] : " + levelMin[i]);
			levelMax[i] = 0;
			System.out.println("levelMax[" + i + "] : " + levelMax[i]);
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.println(i+1 + "��° ���(�θ���, �ڽĳ��)�� �Է��Ͻÿ�.");
			String[] tmp = br.readLine().split("\\s");
			int num = Integer.parseInt(tmp[0]), left = Integer.parseInt(tmp[1]),
			right = Integer.parseInt(tmp[2]);
			tree.get(num).left = left;
			tree.get(num).right = right;
			System.out.println(i+1 + "��° �¾Ƶ�: " + tree.get(num).left);
			System.out.println(i+1 + "��° ��Ƶ�: " + tree.get(num).right);
			if(left != -1) { 
					tree.get(left).parent = num;
					System.out.println(i+1 + "��° �θ� : " + tree.get(left).parent);
			}
			// -1�� �ڽ��� ������ �ǹ�
			if(right != -1) {
				tree.get(right).parent = num;
				System.out.println(i+1 + "��° �θ�: " + tree.get(right).parent);
			}
		}
		for(int i = 1 ; i <= n ; i++) {
			if(tree.get(i).parent == -1) {
				rootIndex = i;
				System.out.println("rootIndex : " + i);
				break;
			}
		}
		//**********************���� ��ȸ�� ����ؼ� ���̿� �ʺ� ����*****************
		inOrder(rootIndex, 1);
		
		//�ϼ��� levelMax[]�� levelMin[]�� ������ ���� �̾Ƴ���
		int answerLevel = 1;
		System.out.println("�ʱ� answerLevel : " + answerLevel);
		int answerWidth = levelMax[1] - levelMin[1] + 1;
		System.out.println("�ʱ� answerWidth : " + answerWidth);
		for(int i = 2; i <= maxLevel ; i++) {
			int width = levelMax[i] - levelMin[i] + 1;
			if(answerWidth < width) {
				answerLevel = i;
				System.out.println(i + "��° " + "answerLevel : " + answerLevel);
				answerWidth = width;
				System.out.println(i + "��° " + "answerWidth : " + answerWidth);
			}
		}
		System.out.println(answerLevel + " " + answerWidth);
		
		
		// TODO Auto-generated method stub
		
	}
	
	public static void inOrder(int rootIndex, int level) {
		Node1 root = tree.get(rootIndex);
		System.out.println("rootIndex : " + rootIndex);
		if(maxLevel < level) {
			maxLevel = level;
			System.out.println("maxLevel : " + maxLevel);
		}
		if(root.left != -1) {
			System.out.println("root.left : " + root.left);
			System.out.println("level + 1 : " + (int)(level + 1));
			inOrder(root.left, level + 1);
		}
		// ���� ��尡 ���� ���� ����� ����
		System.out.println("LevelMin : " + levelMin[level]);
		System.out.println(point);
		levelMin[level] = Math.min(levelMin[level], point);

		// ���� ���� ������庸�� �׻� x��ǥ�� �� ���� ������ ����.
		levelMax[level] = point;
		System.out.println("LevelMax : " + levelMax[level]);
		point++;
		if(root.right != -1) {
			System.out.println("root.right : " + root.right);
			System.out.println("level + 1 : " + (int)(level + 1));
			inOrder(root.right, level + 1);
		}		
	}
	
	
	
	
	
	
	
	
}
