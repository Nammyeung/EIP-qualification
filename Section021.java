import java.util.Scanner;

public class Section021 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int b, c, d, e, mok = 0, nmg;
		
		int a[] = new int[100];
		b = scanf.nextInt();
		c = -1;
		
		while (true)
			
		{
		d = 2;
			e = (int)Math.sqrt(b);
			System.out.printf("%d \n", e);
			while (true)
				
			{
				if (d > e)
				{
					d = b;
					break;
					
				}
				mok = b / d;
				
				nmg = b - mok * d;
				System.out.printf(" - %d %d %d %d %d \n", b, mok, nmg, c, d);
				if (nmg == 0)
					break;
				else
					d++;
			}
			c++;
			a[c] = d;
			if (b == d)
				break;
			b = mok;
			System.out.printf(" * %d %d %d %d \n", b, mok, c, d);
		}
		for (int i = 0; i <= c; i++)
			
			System.out.printf("%d ", a[i]);
		scanf.close();
	}
}