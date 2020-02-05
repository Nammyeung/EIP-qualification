import java.util.Scanner;

public class Section020 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
				
		int b, mok, nmg, i;
		int a[] = new int[100];
		b = scanf.nextInt();
		int c = 0, d = -1;
		while (true)
		{
			c++;
			if (c <= b)
			{
				mok = b / c;
				nmg = b - mok * c;
				if (nmg == 0)
				{
					d++;
					a[d] = c;
				}
			}
			else
			{
				System.out.printf("%d ",  b);
				for(i = 0; i <= d; i++)
					
					System.out.printf("%d ",  a[i]);
				break;
			}
		}
		scanf.close();
	}
}