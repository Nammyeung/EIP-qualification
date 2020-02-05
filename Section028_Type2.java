public class Section028_Type2 {
	public static void main(String[] args) {
		int i, j;
		int a[] = { 0, 1, 0, 1, 0 };
		
		int b[] = new int[5];
		for (i = 4 ; i >= 0 ; i--)
			
		{
			if (a[i] == 1)
				break;
			b[i] = a[i];
		}
		b[i] = a[i];
		System.out.printf("-- %d %d \n", i, b[i]);
		for (j = i - 1 ; j >= 0 ; j--)
			
			b[j] = 1 - a[j];
			System.out.printf("* %d \n", b[j]);
		for (int k = 0; k < 5 ; k++)
			System.out.printf("%d",  a[k]);
		System.out.printf(" ");
		for (int k = 0; k < 5 ; k++)
			System.out.printf("%d",  b[k]);
	}
}