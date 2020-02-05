import java.util.Scanner;

public class Section028_Type1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a[] = new int[5];
		int b1[] = new int[5];
		int b2[] = new int[5];
		int i = -1, c = 1;
		do
		{
			i++;
			a[i] = scanf.nextInt();
			b1[i] = 1 - a[i];
		} while (i < 4);
		do
		{
			b2[i] = b1[i] + c;
			b2[i] = b2[i] % 2;
			System.out.printf("- %d \n", b2[i]);
			c = b1[i] * c;
			System.out.printf("* %d \n", c);	
			i--;
		} while (i >= 0);
		for (int k = 0 ; k < 5 ; k++)
			System.out.printf("%d", a[k]);
		System.out.printf(" ");
		for (int k = 0 ; k < 5 ; k++)
			System.out.printf("%d", b1[k]);
		System.out.printf(" ");
		for (int k = 0 ; k < 5 ; k++)
			System.out.printf("%d",  b2[k]);
		scanf.close();
	}
}
