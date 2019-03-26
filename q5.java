package codex;
stsic long gcd(long a,long b)
{
if(a%b!=0)
	return gcd(a,a%b);
else
	return 0;
}	
static long lcm(long n)
{
long c=1;	
for(long i=1;i<=n;i++)
	c=(c*i)/(gcd(c,i));
	return c;	
}	
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long n=20;
		System.out.println(lcm(n));
	}

}
