import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lessons30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();

		int answer = solution(word);

		System.out.println(" ������ ?? " + answer);

	}//main

	public static int solution(String s) {
		int answer = s.length() ;

		// �߶󺸸鼭 Ȯ���Ѵ�. !! 
		// �ڸ� �� �ִ� �ִ� ũ�� = 7�̸�3�ڱ���, 8�̸��ִ� 4���ڱ��� 
		for ( int i = 1 ; i <= s.length()/2; i ++ ) {

			int result = check( s,i );
			
			if ( result < answer ) answer = result ;

		}

		return answer ;
	}

	private static int check( String s , int size ) {
		
		String result= "";
		
		List<String> words = new ArrayList<String>();
		
		// �������� ũ�⸸ �ڿ� �ٿ��ָ� �ȴ�.
		int exist = s.length()%size;
		
		// size���ھ� ©�� list�� �ִ´�.
		for ( int i = 0 ; i <= s.length()-size; i+=size ) {
			words.add(s.substring(i,i+size));
		}
		
		int cnt = 1 ;
		
		// list������� ���۾��Ѵ�.
		for ( int i = 0 ; i < words.size()-1 ; i ++ ) {
			
			// �������
			if ( words.get(i).equals(words.get(i+1))) {
				cnt++;
			} else { // Ʋ�����
				if ( cnt > 1 ) result = result + String.valueOf(cnt) + words.get(i) ;
				else result += words.get(i);
				
				cnt = 1;
			}
		}
		
		if ( cnt > 1 ) result = result + String.valueOf(cnt) + words.get(words.size()-1);
		else result += words.get(words.size()-1);
		
		return result.length()+exist;
	}
	
}//class