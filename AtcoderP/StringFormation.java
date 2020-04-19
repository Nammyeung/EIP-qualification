package AtcoderP;

import java.util.Scanner;

public class StringFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String input = sc.nextLine().toString();
		StringBuffer sb = new StringBuffer(input);
		System.out.println("StringBuffer�� ��ϵ� ���ڿ� : " + sb);
		
		int T = 0;
		int F = 0;
		System.out.print("�� ����Ƚ���� �Է��Ͻÿ� : ");
		int total = sc.nextInt();
		int count = 0;
		
		
	while(true) {

		if(count == total) {
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		
		System.out.print("T�� �Է��Ͻÿ� : ");
		T = sc.nextInt();
		try {
			if (T == 1) {
				input = reverse(input);
				sb = sb.reverse();
				System.out.println("String�� ���� �ٲ� ���� : " + input);
				System.out.println("StringBuffer�� ���� �ٲ� ���� : " + sb);
			} else if (T == 2) {
				System.out.print("F�� �Է��Ͻÿ� : ");
				F = sc.nextInt();
				System.out.print("�߰��� ���ڸ� �Է��Ͻÿ� : ");
				String add = sc.next();
				try {
					if(F == 1) {
						input = add + input;
						System.out.println("String�� ���� �߰��� ���� : " + input);
						sb = sb.insert(0, add);
						System.out.println("StringBuffer�� ���� �߰��� ���� : " + sb);
					} else if (F == 2) {
						input = input + add;
						System.out.println("String�� ���� �߰��� ���� : " + input);
						sb = sb.insert(input.length()-1, add);
						System.out.println("StringBuffer�� ���� �߰��� ���� : " + sb);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e + "������ �߻��Ͽ����ϴ�.");
					System.out.println("�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				}
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + "������ �߻��Ͽ����ϴ�.");
			System.out.println("�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
		count++;
	}	
	}
	public static String reverse(String input) {
		StringBuffer strBuffer = new StringBuffer();
		
		for (int i = 0 ; i < input.length() ; i++) {
			strBuffer.append(input.charAt(input.length() - i - 1));
		}
		
		return strBuffer.toString();
	}
	
}
