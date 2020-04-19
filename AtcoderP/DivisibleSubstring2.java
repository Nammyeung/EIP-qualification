package AtcoderP;
// 수학적인 내용이 너무 많이 들어가서 이해가 잘 안감, 일단 패스
import java.util.*;

public class DivisibleSubstring2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("문자열 길이를 입력하시오 : ");
		int N = sc.nextInt();
		System.out.print("나눌 수를 입력하시오 : ");
		int P = sc.nextInt();
				
		System.out.print("문자열을 입력하시오 : ");
		String S = sc.next();
		
		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++) {
			A[i] = S.charAt(i) - '0';
			System.out.print(A[i] + "\t");
		}
		System.out.println("\n");
		long ans = 0;
		// 2나 5로 나누려면 해당 if문을 통과 => 이유는?
		// 분수를 기약분수로 나타내었을 때, 분모에 2또는 5 이외의 소인수가 있으면, 그 분수는 무한소수가 되며, 그 무한소수는 순환소수로 나타내어집니다.

		if (P == 2 || P == 5) {
			int c = 0;
			for(int i = N - 1 ; i >= 0 ; i--) {
				// 각각의 문자들이 P로 나눠지면 c횟수를 증가
				// 2나 5로 나누려는 경우 나눠지는 수의 각각의 원소가 2나 5로 나눠지는 경우 카운트를 한다.
				// (카운트의 의미 => 문자열을 나눴을 때 P로 나눠지는 횟수를 구하는 것)
				if(A[i] % P == 0) {
					c++;
				}
				// c가 ans가 됨.
				ans += c;
			}
		// 2나 5로 나누려는 경우가 아닐 때
		} else {
			int m = 0;
			int k = 1;
			Map<Integer, Integer> count = new HashMap<>();
			System.out.println("처음 map을 선언했을 때 map의 공간 " + count);
			count.put(0, 1);
			System.out.println(count);
			for(int i = N - 1 ; i >= 0 ; i--) {
				m = (A[i] * k + m) % P;
				System.out.print("A[i] : " + A[i] + " k : " + k + " m : " + m + " P : " + P + "\n");
				System.out.printf("%s 번째 수행 : (%s 곱하기 %s) 더하기 (이전의 m)) mod %s = %s\n",i, A[i], k, P, m);
				Integer c = count.get(m);
				System.out.printf("키 %s에 들어가 있는 값 : %s\n",m, c);
				if(c == null) {
					c = 1;
				} else {
					ans += c;
					c++;
				}
				
				count.put(m, c);
				System.out.println("m을 변경시켜서 해당 키 값에 c(P로 나눠지는 횟수)의 값을 넣는다 : " + count);
				k = (k * 10) % P;
				System.out.println("k의 값에 10을 곱한 뒤 P로 나눴을 때의 나머지를 k로 둔다 : " + k);
				// 일의 자리 수에서 십의 자리 수로 이어지는 값을 P로 나눴을 때의 나머지를 구하는 수학적 스킬의 종류가 있는 것 같은데 꼭 해야하는지 모르겠으니 일단 패스~
			}
			
		}
		
		System.out.printf("문자열을 잘랐을 때 %s로 나눠지는 문자의 갯수는? : %s\n", P , ans);
		
		}

}
