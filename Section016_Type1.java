import java.util.Scanner;

public class Section016_Type1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int a, i, j;
		a = scanf.nextInt();
		i = a - 1;
		j = 2;
		System.out.printf("%d %d %d \n", a, i ,j);
		while (true)
			
		{
			if (j <= i)
			{
				if (a % j == 0)
					
				{
					System.out.printf("소수 아님");
					break;
				}
				else
					j++;
				System.out.printf("%d %d %d \n", a, i ,j);
				
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



