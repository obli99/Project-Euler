package codex;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=600851475143L;
		long max=0;
		while(n%2==0)
		{
			max=2;
			n=n/2;
		}
			for(long i=3;i<Math.sqrt(n);i=i+2)
			{
				if(n%i==0)
				{
					n=n/i;
					max=n;
				}
			}
			if(n>2)
			System.out.println("The largest prime factor of the number is: "+max );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
