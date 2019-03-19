package codex;

public class q3 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	long number=600851475143L;
		
		for(int i=2;i<number;i++)
		{
			while(number%i==0)
			{
				number=number/i;
				
			}
		}
		if(number>2)
		{
			System.out.println(number);
			
		}
		System.out.println("The largest prime factor is :"+number);
			
		
	}
}	
