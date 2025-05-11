package Pack2;

public class Assign2 
{
	public int div(int a, int b)
	{
		int c = a/b;
		System.out.println("Divide result is "+c);
		return c;
	}
	
	public int sub(int d, int e)
	{
		int f = d-e;
		System.out.println("Sub result is "+f);
		return f;
	}
	
	public int sum(int g, int h)
	{
		int i = g+h;
		System.out.println("Sum result is "+i);
		return i;
	}
	
	public void mult(int j, int k)
	{
		int l = j*k;
		System.out.println("Mult result is "+l);
	}
	
	public static void main(String[] args)
	{
		Assign2 asg = new Assign2();
		
		int divi = asg.div(10, 2);
		int subr = asg.sub(divi, 2);
		int sum1 = asg.sum(subr, 2);
		int subr1 = asg.sub(sum1, 2);
		asg.mult(subr1, 2);
		
	}
	
}
