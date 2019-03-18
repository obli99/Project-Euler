package codex;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0,i=2,prime=0;
		int b=0;
		while(i>0)
		{
			for(long j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					b++;
				}
			}
			if(b==1)
			{
				a++;
			}
			if(a==10001)
			{
				prime=i;
				break;
			}
			i++;
			b=0;
		}
		System.out.println("10001st prirme is :"+prime);

	}

}
