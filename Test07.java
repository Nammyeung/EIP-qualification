public class Test07 {
	static int isprime(int number) {
		int i;
		for(i = 2 ; i < number ; i++)
			
			if(number % i == 0)
				return 0;
		
		return 1;
}

public static void main(String[] args) {
	int number = 10, cnt = 0, i, k, s = 0;
	
	for(k = 2 ; k < number ; k++)
	{
		if(number % k != 0) 
		{
			s = number % k;
			System.out.printf("%d %d \n",k, s);
	
		}
	}
	for(i = 2 ; i < number ; i++)
		
	cnt = cnt + isprime(i);
	
	System.out.printf("%d를 넘지 않는 소수는 %d개입니다.\n",  number, cnt);
	
	} 
}