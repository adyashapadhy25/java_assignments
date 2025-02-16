class Multiplication
{
	public static void main(String args[])
	{
		int b=2;
		Multiplication m=new Multiplication();
		m.multi(b);

	}
	void multi(int b)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(b+"*"+i+"="+(b*i));
		}
	}
}