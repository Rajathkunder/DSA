import java.util.Scanner;
class ScannerUsage{
	public static void main(String[] args){
		int a,b,c;
		System.out.println("Enter first number \n");
		Scanner test=new Scanner(System.in);
		a=test.nextInt();
		System.out.println("Enter second number \n");
		Scanner test1=new Scanner(System.in);
		b=test1.nextInt();
		c=a+b;
		System.out.println("Sum of 2 number is \n"+c);




	}

}