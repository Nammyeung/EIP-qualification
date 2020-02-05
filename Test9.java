import java.lang.Math;

public class Test9 {
	public static void main(String[] args) {
		int p = 2;
		int n = 3;
		while (true) {
			double t = Math.sqrt(n);
			
			int m = (int)t;
			System.out.printf("(* %d 의 제곱근은  %d \n",n, m);
			for (int i = 2 ; i <= m ; i++) {
				
				int r = n % i ;
				if (r == 0)
					
					break;
				
				if ( i == m)
					
					p = n;
			}
			n++;
			System.out.printf("- %d는 소수입니다. \n", p);
			if (n > 100)
				
				break;
		}
		System.out.printf("%d\n",  p);
	}
}

/* 에라토스테네스의 접근
  주어진 자연수 N이 소수이기 위한 필요 충분 조건은 N이 N의 제곱근보다
크지 않은 어떤 소수로도 나눠지지 않는다. 수가 수를 나누면 몫이 발생하게
되는데 묷과 나누는 수, 둘 주 하나는 반드시 N의 제곱근 이하이기 때문이다.

에라토스테네스의 체
에라토스테네스의 체는 매우 간단한 아이디어입니다. 위에서 모든 자연수는
소수들의 곱으로 표현이 된다고 했습니다. 제일 작은 소수 2부터 시작합니다.
2부터 N-1까지의 수 중에서 2의 배수를 모두 체로 거르고 남은 숫자들 중에
서 3의 배수로 거르고를 반복해서 제곱근 N까지 나눠서 걸러지지 않고 남은
수들이 모두 소수가 됩니다.

*/
