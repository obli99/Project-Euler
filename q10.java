package codex;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=2;
		for(long i=3;i<2000000;i=i+2)
		{
			int b=0;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					b=1;
					break;
				}
			}
			if(b==0)
			{
				a=a+i;
			}
		}
		System.out.println("Sum of all the primes below two million ="+a);
	}

}
