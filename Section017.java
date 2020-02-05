import java.util.Scanner;

public class Section017 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
				
		int a, hap, k, j;
		a = scanf.nextInt();
		hap = 0;
		k = 2;
		while (true)
		
		{
			j = 2;
			while (k % j != 0)
				j++;
			if (k == j) {
					
				
					hap += k;
					System.out.printf(" - %d %d %d %d \n", a, k, j, hap);
			}
				if (k < a) {
					
					k++;
					System.out.printf("%d %d %d %d \n", a, k, j, hap);
			}
			else
			{
				System.out.printf("%d", hap);
				break;
			}
		}
		scanf.close();
	}
}
