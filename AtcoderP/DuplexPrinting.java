package AtcoderP;

import java.lang.reflect.Field;
import java.util.Scanner;

public class DuplexPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		int M = (int)N;
		if(N % 2 != 0) {
			System.out.println("한 면은 페이지 한쪽만 : " + (((int)(N+1)) / 2));
		} else {
			System.out.println(M/2);
		}
		System.out.println("\n");
		System.out.println(M/2);
		System.out.println(N/2);
	}

}
