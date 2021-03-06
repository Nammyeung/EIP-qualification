import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lessons30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();

		int answer = solution(word);

		System.out.println(" 정답은 ?? " + answer);

	}//main

	public static int solution(String s) {
		int answer = s.length() ;

		// 잘라보면서 확인한다. !! 
		// 자를 수 있는 최대 크기 = 7이면3자까지, 8이면최대 4글자까지 
		for ( int i = 1 ; i <= s.length()/2; i ++ ) {

			int result = check( s,i );
			
			if ( result < answer ) answer = result ;

		}

		return answer ;
	}

	private static int check( String s , int size ) {
		
		String result= "";
		
		List<String> words = new ArrayList<String>();
		
		// 나머지는 크기만 뒤에 붙여주면 된다.
		int exist = s.length()%size;
		
		// size글자씩 짤라서 list에 넣는다.
		for ( int i = 0 ; i <= s.length()-size; i+=size ) {
			words.add(s.substring(i,i+size));
		}
		
		int cnt = 1 ;
		
		// list대상으로 비교작업한다.
		for ( int i = 0 ; i < words.size()-1 ; i ++ ) {
			
			// 같은경우
			if ( words.get(i).equals(words.get(i+1))) {
				cnt++;
			} else { // 틀린경우
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