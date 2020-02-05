public class Section027_Wait {
	public static void main(String[] args) {
		int m, n, x, s = 0;
		
		int k[] = { 1,2,3,4,7,6,8,9,3,6};
		
		m = 9;
		n = -1;
		
		do
		{
			n++;
			if (k[n] < 5)
				x = 5 - k[n];
			else
				x = k[n] - 5;
			if (m > x)
			{
				m = x;
				s = k[n];
			}
		System.out.printf("* %d %d %d %d \n", n, x, m, s);
		} while (n < 9);
		
		System.out.printf("%d",  s);		
		
	}
}