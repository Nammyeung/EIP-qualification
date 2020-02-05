import java.util.Scanner;

public class Section025_Type2 {
	public static void main(String[] args) {
	Scanner scanf = new Scanner(System.in);
	int m, min, max, hap, avg, i;
	int a[] = new int[7];
	m = -1;
	
	do
	{
		m++;
		a[m] = scanf.nextInt();
	} while (m < 6);
	System.out.printf("- %d %d %d %d %d %d %d \n", a[0], a[1], a[2], a[3], a[4], a[5], a[6]);
	min = a[0];
	max = a[0];
	hap = a[0];
	i = 0;
	
	while(i < 6)
		
	{
		i++;
		hap += a[i];
		if (a[i] < min) {
			min = a[i];
		}
		System.out.printf("%d \n", min);
		if (a[i] > max)
			max = a[i];
		System.out.printf("%d \n", max);
	}
	hap = hap - min - max;
	avg = hap / 5;
	System.out.printf("* %d %d %d %d \n", min, max, hap, avg);
	scanf.close();
	}
}