package AtcoderP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeTraversal {
	
	static Map<String, List<String>> map = new HashMap<>();
	
	private static void preorder(String v) {
		if(v.equals(".")) return;
		System.out.print(v);
		preorder(map.get(v).get(0));
		preorder(map.get(v).get(1));

	}
	
	private static void inorder(String v) {
		if(v.equals(".")) return;
		
		inorder(map.get(v).get(0));
		System.out.print(v);
		inorder(map.get(v).get(1));
	}
	
	private static void postorder(String v) {
		if(v.equals(".")) return;
		
		postorder(map.get(v).get(0));
		postorder(map.get(v).get(1));
		System.out.print(v);
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��ü ����� ������ �Է��Ͻÿ�.");
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(i+1 + "��° ����� �̸��� �Է��Ͻÿ�.");
			String[] tmp = br.readLine().split("\\s");
			List<String> list = new ArrayList<>();
			
			list.add(tmp[1]); list.add(tmp[2]);
			map.put(tmp[0], list);
			System.out.println(tmp[0] + "�� �ڽ� ��� list ȣ�� : " + list);
		}
		
		preorder("A"); System.out.println();
		inorder("A"); System.out.println();
		postorder("A");
	}

}

/*
 * 
First things start with \s (lower case), 
which is a regular expression character class 
for white space, that is space ' ' tabs '\t', 
new line chars '\n' and '\r', vertical tab '\v' 
and a bunch of other characters.

\S (upper case) is the opposite of this, 
so that would mean any non white space character.

���� ��ȸ�� ��� : ABDCEFG // (��Ʈ) (���� �ڽ�) (������ �ڽ�)
���� ��ȸ�� ��� : DBAECFG // (���� �ڽ�) (��Ʈ) (������ �ڽ�)
���� ��ȸ�� ��� : DBEGFCA // (���� �ڽ�) (������ �ڽ�) (��Ʈ)

https://geehye.github.io/baekjoon-1991/#
*/
