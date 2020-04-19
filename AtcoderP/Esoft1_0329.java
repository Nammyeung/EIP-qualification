package AtcoderP;
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        LinkedList array = new LinkedList();
        for(int i = 0 ; i < A.length ; i++) {
            array.add(i);    
        }
        int count = 0;
        
        
        for(int j = 0 ; j < array.size()-2 ; j++) {
            if((int)array.get(j) - (int)array.get(j+1) < 0) {
                if(((int)array.get(j+1) - (int)array.get(j+2)) > 0) {
                    return 0;
                } else if((int)array.get(j+1) - (int)array.get(j+2) < 0){
                    array.remove(j+2);
                    j--;
                } else{
                    return -1;
                }
            }
            count++;
            
            if((int)array.get(j) - (int)array.get(j+1) > 0) {
                if(((int)array.get(j+1) - (int)array.get(j+2)) < 0) {
                    return 0;
                } else if((int)array.get(j+1) - (int)array.get(j+2) > 0){
                    array.remove(j+2);
                    j--;
                } else{
                    return -1;
                }
            }
            count++;
            
        }
        return count;    
       
        }
        
}

