package AtcoderP;

public class LineCodingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer_sheet = "4132315142";
		String[] sheets = new String[10];
		sheets = ["3241523133","4121314445","3243523133","4433325251","2412313253"];
				
		class Solution {
		    public int solution(String answer_sheet, String[] sheets) {
		        int answer = -1;
		        int [] count = new int[answer_sheet.length()];
		        int max = 0;
		        for(int i = 0 ; i < sheets.length ; i++) {  
		            for(int j = 0 ; j < sheets.length ; j++){  
		                    int negnum = 0;
		                    int negpos = 0;
		                    for(int k = 0 ; k < sheets.length ; k++){
		                    if((sheets[i].charAt(k) == sheets[j].charAt(k)) && (int)(sheets[i].charAt(k) - answer_sheet.charAt(k)) != 0){
		                        for(int t = k+1 ; t < sheets.length ; t++){
		                         if((sheets[i].charAt(t) == sheets[j].charAt(t)) && (int)(sheets[i].charAt(t) - answer_sheet.charAt(t)) != 0){
		                            negpos++;                 
		                         } else{
		                            break;
		                         }
		                        }
		                        negnum++;
		                    }
		                    }
		            count[i] = negnum + (negpos*negpos);
		            if(count[i] >= max) {
		            max = count[i];
		            }     
		            }
		        }
		        answer = max;
		        return answer;
		    }
		 }
	}

}
