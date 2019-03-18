package codex;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0, sum=0;
		while(c<4000000)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
			{
				sum=sum+c;
			}
			
		}
		System.out.println(sum);
	}

}
