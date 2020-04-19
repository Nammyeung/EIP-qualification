package AtcoderP;
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int max = 0;
        int compare = 0;
        int mode = 0;
        int numbercheck = 0;
        
        for(int i = 0 ; i < N ; i++) {
            compare = A[i];
            max = max(compare,max);
            
        }
        
        int[] number = new int[max+1];
        
        
        for(int i = 0 ; i < N ; i++) {
            number[A[i]]++;
        }
        for(int j = 0 ; j < number.length; j++){
            if(mode < number[j]) {
                mode = number[j];
                numbercheck = j;
            }
        }
        if(mode <= 1 || numbercheck != mode){
            return 0;
        } else {
            return mode;
        }
    }
    
    public static int max(int a, int b) {
    return a > b ? a : b;
}

}
