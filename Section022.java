import java.util.Scanner;

public class Section022 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int b, bb, c, mok, nmg, i;
		int a[] = new int[10];
		b = scanf.nextInt();
		bb = b;
		c = -1;
		
		do
		{
			c++;
			mok = b / 2;
			nmg = b - mok * 2;
			a[c] = nmg;
			b = mok;
			System.out.printf("%d %d %d a[%d] = %d \n", b, bb, mok, c, nmg);
		} while (mok != 0);
		System.out.printf("%d ",  bb);
		for (i = c; i >= 0; i--)
			
			System.out.printf("%d",  a[i]);
		scanf.close();
	}
}