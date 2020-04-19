package AtcoderP;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("문자열 길이를 입력하시오 : ");
		int N = sc.nextInt();
		System.out.print("나눌 수를 입력하시오 : ");
		int P = sc.nextInt();
				
		String S = "";
		
		int [] S1 = new int[N];
		StringBuffer S2 = new StringBuffer(S);
		
		while(true) {
			System.out.println("문자열을 입력해주세요 : ");
			S = sc.nextLine();
			if(N == S.length()) {
				for(int i = 0 ; i < S1.length ; i++) {
					S1[i] = S.charAt(i);
				} // String => 배열로 옮길
					S2 = S2.append(S);
				break;
			} else {
				System.out.println("다시 입력해 주시기 바랍니다.");
			}
		}
		System.out.println("String에 저장된 문자열 : " + S);
//		System.out.println("Array에 저장된 문자열 : " + S1);
		System.out.println("StringBuffer에 저장된 문자열 : " + S2);
		int countString = 0;
		int countBuffer = 0;
		
		for(int j = 0 ; j < S1.length ; j++) {
			// String에 의한 추출
			for(int k = j+1 ; k <= S1.length ; k++) {
				System.out.println("String을 이용한 방법");
				System.out.println(S.substring(j, k));
				if(Integer.parseInt(S.substring(j, k)) % P == 0 ) {
					countString++;
				};
				System.out.println("StringBuffer을 이용한 방법");
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
