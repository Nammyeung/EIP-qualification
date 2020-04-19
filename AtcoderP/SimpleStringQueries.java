package AtcoderP;

import java.util.Scanner;

public class SimpleStringQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열의 길이를 입력하시오 : ");
		int n = sc.nextInt();
		int count = 0;
		
		StringBuffer strbuffer;
//		1번 방법
		while(true) {
					
			System.out.print("문제에 사용할 문자열을 입력하시오 : ");
			strbuffer = new StringBuffer(sc.next());
			StringBuffer strbuffer1 = strbuffer;
			if(strbuffer.length() == n) {
				break;
			}
		}
		System.out.print("문제의 갯수를 입력하시오 : ");
//		int q = sc.nextInt();
		
		System.out.print("query를 입력하시오 : ");
		String[] a = sc.next().split(",");
					
		if (Integer.parseInt(a[0]) == 1) {
			 strbuffer.insert(Integer.parseInt(a[1]), a[2]);
			 System.out.print("바뀐 문자는 : " + strbuffer);
			 System.out.println("\n");
			
		}else if (Integer.parseInt(a[0]) == 2) {
			for(int i = Integer.parseInt(a[1])-1 ; i < strbuffer.length() ; i++) {
				for(int j = i ; j < strbuffer.length(); j++) {	
					if(strbuffer.charAt(i-1) != strbuffer.charAt(j)) {
					System.out.print(j+1 + "번째 : " + strbuffer.charAt(j) + "\n");
					break;
				}
			}
		}
		
	}
//		2번 방법
//		3번 방법
//		4번 방법
}
}