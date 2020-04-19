package AtcoderP;

import java.util.Scanner;

public class StringFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String input = sc.nextLine().toString();
		StringBuffer sb = new StringBuffer(input);
		System.out.println("StringBuffer에 등록된 문자열 : " + sb);
		
		int T = 0;
		int F = 0;
		System.out.print("총 시행횟수를 입력하시오 : ");
		int total = sc.nextInt();
		int count = 0;
		
		
	while(true) {

		if(count == total) {
			System.out.println("종료되었습니다.");
			break;
		}
		
		System.out.print("T를 입력하시오 : ");
		T = sc.nextInt();
		try {
			if (T == 1) {
				input = reverse(input);
				sb = sb.reverse();
				System.out.println("String에 의해 바뀐 문자 : " + input);
				System.out.println("StringBuffer에 의해 바뀐 문자 : " + sb);
			} else if (T == 2) {
				System.out.print("F를 입력하시오 : ");
				F = sc.nextInt();
				System.out.print("추가할 문자를 입력하시오 : ");
				String add = sc.next();
				try {
					if(F == 1) {
						input = add + input;
						System.out.println("String에 의해 추가된 문자 : " + input);
						sb = sb.insert(0, add);
						System.out.println("StringBuffer에 의해 추가된 문자 : " + sb);
					} else if (F == 2) {
						input = input + add;
						System.out.println("String에 의해 추가된 문자 : " + input);
						sb = sb.insert(input.length()-1, add);
						System.out.println("StringBuffer에 의해 추가된 문자 : " + sb);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e + "에러가 발생하였습니다.");
					System.out.println("다시 입력해 주시기 바랍니다.");
				}
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + "에러가 발생하였습니다.");
			System.out.println("다시 입력해 주시기 바랍니다.");
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
