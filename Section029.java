import java.util.Scanner;

public class Section029 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int i;
		int input[] = new int[5];
		int cont[] = new int[4];
		for (i = 0 ; i <= 4 ; i++)
			
			input[i] = scanf.nextInt();
		cont[0] = input[1];
		System.out.printf("* %d \n", cont[0]);
		if (input[0] == 1)
			
		{
			for (i = 0 ; i <= 2 ; i++)
				
			{
				if (input[i + 2] == cont[i])
					cont[i + 1] = 0;
			    
				else
					cont[i + 1] = 1;
				
			}
		}
		else
		{
			for ( i = 0 ; i <= 2 ; i++)
			
			{
				if ( input[i + 1] == input[i + 2])
					cont[i + 1] = 0;
				else
					cont[i + 1] = 1;
			}
		}
		if (input[0] == 1)
			
			System.out.printf("이진수 ");
		else
			System.out.printf("그레이코드 ");
		for (i = 0 ; i <= 3 ; i++)
			
			System.out.printf("%d",  cont[i]);
		scanf.close();
		}
}