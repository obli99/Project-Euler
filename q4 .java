package codex;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n,i,j;
		int d;
		int max=0;
		for (i=999;i>=100;i--){
		
		    for( j=999;j>=100;--j)
			{
			    d=0;
				n=0;
				n=i*j;
				int m=n;
				while(n>0)
				{
					r=n%10;
					d=(d*10)+r;
					n=n/10;
				}
				if(m==d)
				{
					if(m>max)
					   max=m;
					
				}
		    }
		}
		System.out.println(max);
		}
	
}
