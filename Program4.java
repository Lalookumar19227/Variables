class Program4
{
	public static void main(String[] piyush)
	{
			int a=40;
			//static int x=98; Here a local variable is static which is not possible 
			System.out.println(a);
			{
				int b=60;
				System.out.println(a);
				System.out.println(b);
			}
			{
				int c=80;
				System.out.println(a);
				System.out.println(c);
			}
			System.out.println(a);
			/*System.out.println(b);	
			System.out.println(c);	
			Here b and c are being accessed
			outside its block */	
	}
	
}




