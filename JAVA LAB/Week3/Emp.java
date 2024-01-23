import java.util.*;

class Employee{
int empcode;
String empname;
double basic,hra,it,pf,net,gross;

public void readData(){
	Scanner obj = new Scanner(System.in);
	System.out.println(" employee id ");
	empcode = obj.nextInt();
	System.out.println(" employee name ");
	empname=obj.next();
	System.out.println(" Basic salary ");
	basic=obj.nextDouble();




}

 void calculation(){
	hra=basic*0.75;

gross=basic+hra;
it=200;
pf=basic*0.12;
net=gross-(it+pf);
//System.out.println("net is"+net);

}

 void display(){

	System.out.println("Enter employee id "+empcode);

		System.out.println("Enter employee name \n"+empname);

		System.out.println("Enter Basic salary \n"+basic);
		System.out.println("net salary is\n"+net);

}



}

class Emp{
	public static void main(String[] args){

	int ch;
	Employee emp=new Employee();
	while(true){
	System.out.println("---MENU-----");
				System.out.println("1.Enter data \n");
				System.out.println("2.calculate data");
				System.out.println("3.Display details");
				System.out.println("4.Press 0 to exit\n");
			System.out.println("Enter your choice \n");
Scanner obj = new Scanner(System.in);
ch=obj.nextInt();


switch(ch){

	case 1:
	emp.readData();
	break;
	case 2: emp.calculation();

			break;
	case 3:emp.display();
	break;
	case 4:
	System.exit(0);
}


}
}

	}

