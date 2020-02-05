import java.util.Scanner;

public class Section024 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String a, munja;
		
		double d, e;
		a = scanf.nextLine();
		double b = 0;
		int c = -1;
		while (true)
		{
			c++;
			if (c <= 9)
			{
				munja = Character.toString(a.charAt(c));
				
				d = Integer.parseInt(munja);
				
				e = d * Math.pow(2,  4-c);
				
				b += e;
			}
			else
			{
				System.out.printf("%8.5f", b);
				break;
			}
		}
		scanf.close();
	}
}