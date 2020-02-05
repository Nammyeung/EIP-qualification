import java.util.Scanner;

public class Section028_Type3 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int i, c;
		for (i = 0 ; i <= 4 ; i++)
			
			a[i] = scanf.nextInt();
		c = 1;
		for (i = 4 ; i >= 0 ; i--)
		
		{
			b[i] = a[i] - c;
			System.out.printf("* %d - %d = %d \n", a[i], c, b[i]);
			if (a[i] == 0 && c == 1)
				
				
				c = 1;
			else
				c = 0;
			b[i] = Math.abs(b[i]);
			System.out.printf("** %d \n", b[i]);
		}
		for (i = 0 ; i <= 4 ; i++)
			
			b[i] = 1 - b[i];
		for (int k = 0 ; k <= 4 ; k++)
			System.out.printf("%d",  a[k]);
		System.out.printf(" ");
		for (int k = 0 ; k <= 4 ; k++)
			System.out.printf("%d",  b[k]);
		scanf.close();
	}
}