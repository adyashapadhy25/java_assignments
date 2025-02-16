class Pattern
{
	public static void main (String args[])
	{
		Pattern p=new Pattern();
		p.patt();
	}
	void patt()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}