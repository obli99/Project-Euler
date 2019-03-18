package codex;

public class q9 {

	public static void main(String[] args) {
		int sum=1000;
		int a=0,b=0,c=0;
		int product=0;
		for(a=1;a<=sum/3;a++)
		{
		
			for(b=a+1;b<=sum/2;b++)
			{
				 c=sum-a-b;
				if(c>0 && (a*a+ b*b==c*c))
					
				product =a*b*c;
			}
		}
					System.out.println("a="+a);
					System.out.println("b="+b);
					System.out.println("c="+c);
					System.out.println(product);

	}

}
