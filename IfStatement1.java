import java.util.Scanner;
class IfStatement1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		if(a==0)
			System.out.println("Zero");
		else if(a>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
}