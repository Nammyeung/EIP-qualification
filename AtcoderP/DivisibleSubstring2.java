package AtcoderP;
// �������� ������ �ʹ� ���� ���� ���ذ� �� �Ȱ�, �ϴ� �н�
import java.util.*;

public class DivisibleSubstring2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���ڿ� ���̸� �Է��Ͻÿ� : ");
		int N = sc.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		int P = sc.nextInt();
				
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String S = sc.next();
		
		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++) {
			A[i] = S.charAt(i) - '0';
			System.out.print(A[i] + "\t");
		}
		System.out.println("\n");
		long ans = 0;
		// 2�� 5�� �������� �ش� if���� ��� => ������?
		// �м��� ���м��� ��Ÿ������ ��, �и� 2�Ǵ� 5 �̿��� ���μ��� ������, �� �м��� ���ѼҼ��� �Ǹ�, �� ���ѼҼ��� ��ȯ�Ҽ��� ��Ÿ�������ϴ�.

		if (P == 2 || P == 5) {
			int c = 0;
			for(int i = N - 1 ; i >= 0 ; i--) {
				// ������ ���ڵ��� P�� �������� cȽ���� ����
				// 2�� 5�� �������� ��� �������� ���� ������ ���Ұ� 2�� 5�� �������� ��� ī��Ʈ�� �Ѵ�.
				// (ī��Ʈ�� �ǹ� => ���ڿ��� ������ �� P�� �������� Ƚ���� ���ϴ� ��)
				if(A[i] % P == 0) {
					c++;
				}
				// c�� ans�� ��.
				ans += c;
			}
		// 2�� 5�� �������� ��찡 �ƴ� ��
		} else {
			int m = 0;
			int k = 1;
			Map<Integer, Integer> count = new HashMap<>();
			System.out.println("ó�� map�� �������� �� map�� ���� " + count);
			count.put(0, 1);
			System.out.println(count);
			for(int i = N - 1 ; i >= 0 ; i--) {
				m = (A[i] * k + m) % P;
				System.out.print("A[i] : " + A[i] + " k : " + k + " m : " + m + " P : " + P + "\n");
				System.out.printf("%s ��° ���� : (%s ���ϱ� %s) ���ϱ� (������ m)) mod %s = %s\n",i, A[i], k, P, m);
				Integer c = count.get(m);
				System.out.printf("Ű %s�� �� �ִ� �� : %s\n",m, c);
				if(c == null) {
					c = 1;
				} else {
					ans += c;
					c++;
				}
				
				count.put(m, c);
				System.out.println("m�� ������Ѽ� �ش� Ű ���� c(P�� �������� Ƚ��)�� ���� �ִ´� : " + count);
				k = (k * 10) % P;
				System.out.println("k�� ���� 10�� ���� �� P�� ������ ���� �������� k�� �д� : " + k);
				// ���� �ڸ� ������ ���� �ڸ� ���� �̾����� ���� P�� ������ ���� �������� ���ϴ� ������ ��ų�� ������ �ִ� �� ������ �� �ؾ��ϴ��� �𸣰����� �ϴ� �н�~
			}
			
		}
		
		System.out.printf("���ڿ��� �߶��� �� %s�� �������� ������ ������? : %s\n", P , ans);
		
		}

}
