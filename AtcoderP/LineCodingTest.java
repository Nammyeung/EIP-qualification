package AtcoderP;
import java.util.*;
import java.io.*;

public class LineCodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int answer = -1;
        int count = 0;
        for(int i = 0 ; i < inputString.length(); i++){
        			if(inputString.charAt(i) == ')' || inputString.charAt(i) == '}' ||
        			inputString.charAt(i) == ']' || inputString.charAt(i) == '>') {
        					return -1;
        					break;
        			}
        			else if(inputString.charAt(i) == '(' || inputString.charAt(i) == '{' ||
                   inputString.charAt(i) == '[' || inputString.charAt(i) == '<'){
                			count++;
                	System.out.println(i + "번째 문자 검증중 : " + inputString.charAt(i));
                    	for(int j = i+1 ; j < inputString.length(); j++){
                    		if(inputString.charAt(j) == ')' || inputString.charAt(j) == '}' ||
                    				inputString.charAt(j) == ']' || inputString.charAt(j) == '>'){
                                	System.out.println(j + "번째 문자 검증중 : " + inputString.charAt(j));
                                	break;
                        }
                    }
                } 
//                if(inputString.charAt(i) == ')' || inputString.charAt(i) == '}' ||
//                           inputString.charAt(i) == ']' || inputString.charAt(i) == '>') {
//                                break;
//                 }
        }
        answer = count;
        System.out.println(answer);
	}

}
