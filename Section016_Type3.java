import java.util.Scanner;

public class Section016_Type3 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
				
		int a, j;
		a = scanf.nextInt();
		j = 2;
		while (true)
		
		{
			if (j <= Math.sqrt(a))
				
			{
				if(a % j == 0)
					
				{
					System.out.printf("소수 아님");
					break;
				}
				else
					j++;
				double k = Math.sqrt(a);
				System.out.printf("%d %f %d\n", a,k, j);
			}
			else
			{
				System.out.printf("소수");
				break;
			}
		}
		scanf.close();
	}
}
