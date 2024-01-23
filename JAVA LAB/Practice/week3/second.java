import java.util.*;
 class employee{
	Scanner sc=new Scanner(System.in);
	int empno;
	String empName;
	double basic;
	double hra;
	double it;
	double pf;
	double netSal;
	double grossSal;

	void input()
	{
	System.out.println("enter the employee code,employee name,basic");
	empno=sc.nextInt();
	empName=sc.next();
	basic=sc.nextFloat();

	}
	void calculate()
	{
		it=200;
	hra=0.075*basic;
	pf=0.12*basic;
	grossSal=basic+hra;
	netSal=grossSal-(it+pf);
	}
	void display()
	{
		System.out.println("Gross salary is : "+grossSal);
	System.out.println("Net salary is : "+netSal);
	}
}
class second{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		employee obj=new employee();

		while(true){
			System.out.println("1.Input Data");
			System.out.println("2.Calculate");
			System.out.println("3.display Data");
			System.out.println("4.Exit");
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
		switch(ch){
			case 1:
		obj.input();
		break;
		case 2:
			obj.calculate();
		break;
		case 3:
			obj.display();
		break;
		case 4:
		System.exit(0);
	}
	}
	}
}
