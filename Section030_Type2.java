import java.util.Scanner;

public class Section030_Type2 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int i, z, c, j;
		int x[] = new int[10];
		int y[] = new int[10];
		int a[] = new int[10];
		for (i = 0 ; i <= 9 ; i++)
			
			x[i] = scanf.nextInt();
		for (i = 0 ; i <= 9 ; i++)
			
			y[i] = scanf.nextInt();
		z = c = 0;
		j = 9;
		
		do
		{
			z = x[j] + y[j] + c;
			if (z < 2)
			{
				c = 0;
				a[j] = z;
			}
			else
			{
				c = 1;
				a[j] = z - 2;
			}
			j--;
		} while (j >= 0);
		if (c == 0)
		{
			do
			{
				j++;
				System.out.printf("%d",  a[j]);
				
			} while (j < 9);
		}
		else
			System.out.printf("OVERFLOW!!");
		scanf.close();
					
	}
}