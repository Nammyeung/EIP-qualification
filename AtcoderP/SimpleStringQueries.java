package AtcoderP;

import java.util.Scanner;

public class SimpleStringQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� ���̸� �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		int count = 0;
		
		StringBuffer strbuffer;
//		1�� ���
		while(true) {
					
			System.out.print("������ ����� ���ڿ��� �Է��Ͻÿ� : ");
			strbuffer = new StringBuffer(sc.next());
			StringBuffer strbuffer1 = strbuffer;
			if(strbuffer.length() == n) {
				break;
			}
		}
		System.out.print("������ ������ �Է��Ͻÿ� : ");
//		int q = sc.nextInt();
		
		System.out.print("query�� �Է��Ͻÿ� : ");
		String[] a = sc.next().split(",");
					
		if (Integer.parseInt(a[0]) == 1) {
			 strbuffer.insert(Integer.parseInt(a[1]), a[2]);
			 System.out.print("�ٲ� ���ڴ� : " + strbuffer);
			 System.out.println("\n");
			
		}else if (Integer.parseInt(a[0]) == 2) {
			for(int i = Integer.parseInt(a[1])-1 ; i < strbuffer.length() ; i++) {
				for(int j = i ; j < strbuffer.length(); j++) {	
					if(strbuffer.charAt(i-1) != strbuffer.charAt(j)) {
					System.out.print(j+1 + "��° : " + strbuffer.charAt(j) + "\n");
					break;
				}
			}
		}
		
	}
//		2�� ���
//		3�� ���
//		4�� ���
}
}