import java.util.Scanner;

public class Section022_Wait {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int b, bb, c, mok, nmg, k, i;
		int a[] = new int[10];
		b = scanf.nextInt();
		bb = b;
		c = -1;
		
		do
		{
			c++;
			mok = b / 2;
			
			nmg = b - mok * 2;
			a[9-c] = nmg;
			
			b = mok;
			System.out.printf("%d %d %d a[%d] = %d \n", b, bb, mok, 9-c, nmg);
		} while (mok != 0);
		
		System.out.printf("bb = %d ",  bb);
		k = 9 - c;
		System.out.printf("k = %d \n", k);
		for (i = k; i < 10; i++)
			
			System.out.printf("%d",  a[i]);
		scanf.close();
	}
}