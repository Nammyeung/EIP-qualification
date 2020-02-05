public class Section026 {
	public static void main(String[] args) {
		int cnt, hap, mok, nmg, i;
		cnt = hap = 0;
		for (i = 1; i <= 100; i++)
		{
			mok = i / 5;
			
			nmg = i - mok * 5;
			System.out.printf("%d %d \n", mok, nmg);
			if (nmg == 0)
			{
				cnt++;
				hap += i;
			}
			
		}
		System.out.printf("%d %d", cnt, hap);
	}
}