package AtcoderP;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���ڿ� ���̸� �Է��Ͻÿ� : ");
		int N = sc.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		int P = sc.nextInt();
				
		String S = "";
		
		int [] S1 = new int[N];
		StringBuffer S2 = new StringBuffer(S);
		
		while(true) {
			System.out.println("���ڿ��� �Է����ּ��� : ");
			S = sc.nextLine();
			if(N == S.length()) {
				for(int i = 0 ; i < S1.length ; i++) {
					S1[i] = S.charAt(i);
				} // String => �迭�� �ű�
					S2 = S2.append(S);
				break;
			} else {
				System.out.println("�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
			}
		}
		System.out.println("String�� ����� ���ڿ� : " + S);
//		System.out.println("Array�� ����� ���ڿ� : " + S1);
		System.out.println("StringBuffer�� ����� ���ڿ� : " + S2);
		int countString = 0;
		int countBuffer = 0;
		
		for(int j = 0 ; j < S1.length ; j++) {
			// String�� ���� ����
			for(int k = j+1 ; k <= S1.length ; k++) {
				System.out.println("String�� �̿��� ���");
				System.out.println(S.substring(j, k));
				if(Integer.parseInt(S.substring(j, k)) % P == 0 ) {
					countString++;
				};
				System.out.println("StringBuffer�� �̿��� ���");
				System.out.println(S2.substring(j, k));
				if(Integer.parseInt(S2.substring(j, k)) % P == 0 ) {
					countBuffer++;
				};
			}
		}
		System.out.println("Output : " + countString);
		System.out.println("Output : " + countBuffer);
		}

}
