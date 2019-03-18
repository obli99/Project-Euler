package codex;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		for(int i=3;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
			{	
				sum1=sum1+i;
			}
			
		}
		System.out.println("The sum of multiples is "+sum1);
	}

}
