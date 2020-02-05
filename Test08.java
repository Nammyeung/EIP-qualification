import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int num[] = new int[10];
		int min = 9999;
		int i;
		for (i = 0 ; i < 10 ; i++ ) {
			num[i] = scanf.nextInt();
		}
		for (i = 0 ; i < 10 ; i++ ) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.printf("가장 작은 값은 %d이다.",  min);
	}
}