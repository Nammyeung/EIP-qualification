import java.util.Scanner;

public class Section025_Type1 {
	public static void main(String[] args ) {
		Scanner scanf = new Scanner(System.in);
		int i;
		int a[] = new int[10];
		int j = -1, max = 0;
		
		do
		{
			j++;
			a[j] = scanf.nextInt();
		} while (j < 9);
		
		for (i = 0; i <= 9; i++)
			
		{
			System.out.printf("%d ", max);
			if (a[i] > max) 
				max = a[i];
		}
		System.out.printf("%d", max);
		scanf.close();
	}
}