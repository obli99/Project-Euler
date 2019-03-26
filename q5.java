package codex;
class q5{
static long gcd(long a,long b)
{
if(a%b!=0)
	return gcd(b,a%b);
else
	return b;
}	
static long lcm(long n)
{
long c=1;	
for(long i=1;i<=n;i++)
	c=(c*i)/(gcd(c,i));
	return c;	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long n=20;
		System.out.println(lcm(n));
	}

}
