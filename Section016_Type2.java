import java.util.Scanner;

public class Section016_Type2 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int a, j;
		a = scanf.nextInt();
		j = 2;
		System.out.printf("%d %d \n", a, j);
		while (a % j != 0)
			j++;
		System.out.printf("%d %d \n", a, j);
		if ( a == j)
			
			System.out.printf("소수");
		else
			System.out.printf("소수 아님");
		scanf.close();
	}
}	


