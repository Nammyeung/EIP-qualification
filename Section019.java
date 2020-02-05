import java.util.Scanner;

public class Section019 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
				
		int a, b, big, small, mok, nmg, gcm, lcm;
		a = scanf.nextInt();
		b = scanf.nextInt();
		if (a >= b)
		{
			big = a;
			small = b;
			
		}
		else
		{
			big = b;
			small = a;
		}
		while (true)
		{
			mok = big / small;
			nmg = big - mok * small;
			if (nmg == 0)
			{
				gcm = small;
				lcm = a * b / gcm;
				System.out.printf(" - %d %d %d %d %d %d %d %d \n", a, b, big, small, mok, nmg, gcm, lcm);
				System.out.printf("최대공약수 : %d 최소공배수 : %d" ,  gcm, lcm);
				break;
			}
			big = small;
			small = nmg;
			System.out.printf("%d %d %d %d %d %d \n", a, b, big, small, mok, nmg);
		}
		scanf.close();
	}
}