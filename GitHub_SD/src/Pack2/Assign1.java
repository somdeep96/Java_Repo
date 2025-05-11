package Pack2;

public class Assign1
{
//Day 3 code... to resolve (((((10+2)+2)-2)*2)/2)
		public int sum(int a, int b)  //This method is an example of parameterized and non void method.
		{
			int c = a+b;
			System.out.println("Sum result is "+c);
			return c;		//Return keyword is used to return the value of the method for further use.
		}
		
		public int sub(int d,int e)
		{
			int f = d-e;
			System.out.println("Sub result is "+f);
			return f;
		}
		
		public int mult(int g, int h)
		{
			int i = g*h;
			System.out.println("Mult reuslt is "+i);
			return i;
		}
		
		public void divide(int j, int k)	//This method is an example of parameterized and void method. No return keyword is used in it.
		{
			int l = j/k;
			System.out.println("Final result is "+l);
		}
		
		public static void main(String[] args)
		{
			Assign1 asg = new Assign1();
			
			//variable sum1, sum2, subt, mul are created to store the values returned from method sum, sub & mult.
			
			int sum1 = asg.sum(10, 2);
			int sum2 = asg.sum(sum1, 2);
			int subt = asg.sub(sum2, 2);
			int mul = asg.mult(subt, 2);
			asg.divide(mul, 2); 	//No variable is created in main method for divide because the divide method is not returning any value.
		}
}

