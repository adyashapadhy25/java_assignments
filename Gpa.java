import java.util.Scanner;
class Gpa{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Grade in 1st subject");
		int G1=sc.nextInt();
		System.out.println("Grade in 2nd subject");
		int G2=sc.nextInt();
		System.out.println("Grade in 3rd subject");
		int G3=sc.nextInt();
		int sum=G1+G2+G3;
		System.out.println(sum);
		float Gpa=sum/30;
		System.out.println(Gpa);
	}
}