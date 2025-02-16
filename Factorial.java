class Factorial
{
	public static void main(String args[])
	{
		int b=5;
		Factorial f=new Factorial();
		int result=f.fact(b);
		System.out.println("factorial of "+ b +" is "+ result );
	}
	int fact(int b)
	{
		if(b==0){
		return 1;
	}else{
		return b*fact(b-1);
	}
}
}