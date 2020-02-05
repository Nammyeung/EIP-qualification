import java.util.Scanner;

public class Section030_Type1 {
	public static void main(String[] arags) {
		Scanner scanf = new Scanner(System.in);
		int i, j, mok, nmg;
		int a[] = new int[12];
		int b[] = new int[14];
		
		while (true)
		
		{
			for (i = 0 ; i <= 11 ; i++)
				
				a[i] = scanf.nextInt();
			if (a[0] == 0)
				
				break;
			else
				for (i = 0 ; i <= 11 ; i++)
					
					b[i + 2] += a[i];
		}
		for (i = 13 ; i >= 1 ; i--)
			
		{
			mok = b[i] / 10;
			nmg = b[i] - mok * 10;
			b[i] = nmg;
			b[i - 1] += mok;
		}
		if (b[0] == 0)
			j = 1;
		else
			j = 0;
		for (i = j ; i <= 13; i++)
			
			System.out.printf("%d",  b[i]);
		scanf.close();
		}
	}
