class Naturalno
{
	public static void main(String args[])
	{
		Naturalno s=new Naturalno();
		int result=s.sum(10);
		System.out.println("sum of 10 natural no is:"+result);
	}
	int sum(int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}
}