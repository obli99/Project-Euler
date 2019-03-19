package codex;

public class q3 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	long number=600851475143L;
		int max=0;
		for(int i=2;i<number;i++)
		{
			while(number%i==0)
			{
				System.out.println(i+" ");
				number=number/i;
				
			}
		}
		if(number>2)
		{
			max=(int) number;
			System.out.println(number);
			
		}
		System.out.println("The largest prime factor is :"+number);
			
		
	}
}	
