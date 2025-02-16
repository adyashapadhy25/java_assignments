import java.util.Scanner;
class percentage{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("marks of five subjects");
		System.out.println("enter the mark of math");
		float a=sc.nextFloat();
		System.out.println("enter the mark of physics");
		float b=sc.nextFloat();
		System.out.println("enter the mark of science");
		float c=sc.nextFloat();
		System.out.println("enter the mark of english");
		float d=sc.nextFloat();
		System.out.println("enter the mark of odia");
		float e=sc.nextFloat();
		System.out.println("your total mark");
		float yourtotalmark= a+ b+c+ d+ e;
		System.out.println(yourtotalmark);
		float totalmark=500;
		System.out.println(totalmark);
		float percentage=(yourtotalmark/totalmark)*500;
		System.out.println(percentage);
	}
}

