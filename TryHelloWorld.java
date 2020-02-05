import java.util.Scanner;

class TryHelloWorld
{
    public String getDayName(int a, int b) {
        String answer = "";
        String[] day = { "WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
    	int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
            System.out.printf("%d %d %d \n",i + 1 , date[i], allDate);
        }
        allDate += (b - 1);
        System.out.printf("%d %d %d\n", b , allDate, (allDate % 7));
        answer = day[allDate % 7];
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		int b = scanf.nextInt();
	
        System.out.println(test.getDayName(a,b));
    }
}