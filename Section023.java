import java.util.Scanner;

public class Section023 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int b, c, d, e, f;
		char a[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',};
		b = scanf.nextInt();
		c = scanf.nextInt();
		d = 1;
		while (d <= c) {
			
			d *= b;
		System.out.printf("- %d \n", d); }
		while (true)
			
		{
			if (d > 1)
				d /= b;
			e = c / d;
			f = c - e * d;
			System.out.printf("* %d %d a[%d] = %c \n", c, f, e, a[e]);
			System.out.printf("= %c \n",  a[e]);
			
			if (d != 1)
				c = f;
			else
				break;
		}
		scanf.close();
	}
}