package AtcoderP;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] bingo = new int[3][3];
		char [][] answersheet = new char[3][3];
		
		System.out.println("-----------------빙고판 생성--------------------");
		for(int i = 0 ; i < bingo.length ; i++) {
			for(int j = 0 ; j < bingo[i].length ; j++) {
				System.out.print("빙고 숫자를 입력하시오 : ");
				int binnum = sc.nextInt();
				bingo[i][j] = binnum;
			}
			System.out.print("\n");
		}
		
		for(int i = 0 ; i < bingo.length ; i++) {
			for(int j = 0 ; j < bingo[i].length ; j++) {
				System.out.printf("[%s]",bingo[i][j]);

			}
			System.out.print("\n");

		}
		System.out.println("\n");
		System.out.println("-----------------게임 시작--------------------");
		System.out.print("빙고를 맞출 제한 숫자 갯수를 선택하세요 : ");
		int N = sc.nextInt();
				
		for(int i = 0 ; i < N ; i++) {
			System.out.print("1번 선수가 선택한 번호는? : ");
			int b = sc.nextInt();
			for(int t = 0 ; t < answersheet.length ; t++) {
				for(int k = 0 ; k < answersheet[t].length ; k++) {
					if(b == bingo[t][k]) {
						answersheet[t][k] = 'o';
						System.out.printf("%s항 %s열에 %s가 들어갔습니다.\n",t+1,k+1,answersheet[t][k]);
					} else {
						continue;
					}
				}
			}
		}
		System.out.println("\n");
		System.out.println("-----------------정답지 구간--------------------");
		int count = 0;
		String gotbingo = "No";
		for(int i = 0 ; i < answersheet.length ; i++) {
			count = 0;
			for(int j = 0 ; j < answersheet[i].length ; j++) {
				if(answersheet[i][j] == 'o') {
					count++;
					if(count == 3) {
						gotbingo = "Yes";
						break;
					}
					
				}
				
			}
		}
		
		for(int i = 0 ; i < answersheet.length ; i++) {
			count = 0;
			for(int j = 0 ; j < answersheet[i].length ; j++) {
				if(answersheet[j][i] == 'o') {
					count++;
					if(count == 3) {
						gotbingo = "Yes";
						break;
					}
					
				}
				
			}
		}
		
		count = 0;
		for(int i = 0 ; i < answersheet.length ; i++) {
			for(int j = 0 ; j < answersheet[i].length ; j++) {
				System.out.printf("[%c]",answersheet[i][j]);
				if(i == j && answersheet[i][j] == 'o') {
						count++;
						if(count == 3) {
							gotbingo = "Yes";
							break;
						}
				}
			}
			System.out.print("\n");

		}
		
	System.out.println(gotbingo);	
		
		
		
	}
}
