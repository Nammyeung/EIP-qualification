import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		String word = sc.nextLine();
				
		int split_word = 0;
		int max = 0;
		for(int i = 0 ; i < N-2 ; i++) {
			split_word = Integer.parseInt(word.substring(i, i+3));
			max = max(split_word, max);
		}
		print(max);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static int print(int max) {
		return 0;
	}
	
}
