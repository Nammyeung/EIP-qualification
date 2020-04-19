package AtcoderP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class SimpleStringQueries1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("전체 문자 수를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.print("문자열을 입력하시오 : ");
		String s = sc.next();
		System.out.print("쿼리 반복 횟수를 입력하시오 : ");
		int q = sc.nextInt();
		
		Map<Character, TreeSet<Integer>> charRangeMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if(!charRangeMap.containsKey(c))
             charRangeMap.put(c, new TreeSet<>());
           charRangeMap.get(c).add(i);
        }
        char[] charArray = s.toCharArray();
        for(int i = 0; i < q; i++) {
            int oper = sc.nextInt();
            if(oper == 1) {
                int idx = sc.nextInt() - 1;
                char newChar = sc.next().charAt(0);
                char originalChar = charArray[idx];
                if(originalChar == newChar) continue;
                charArray[idx] = newChar;
                if(!charRangeMap.containsKey(newChar)) {
                    charRangeMap.put(newChar, new TreeSet<>());
                }
                charRangeMap.get(originalChar).remove(idx);
                charRangeMap.get(newChar).add(idx);
            } else {
                int left = sc.nextInt() - 1;
                int right = sc.nextInt() - 1;
                int cnt = 0;
                for(Map.Entry<Character, TreeSet<Integer>> entry : charRangeMap.entrySet()) {
                     TreeSet<Integer> range = entry.getValue();
                     if(range.subSet(left, right+1).isEmpty()) continue;
                     else cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
