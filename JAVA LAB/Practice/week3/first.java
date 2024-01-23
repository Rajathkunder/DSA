import java.util.*;
class shop
{
	int itemId;
	String itemName;
	double quantity;
	double unitPrice,totalPrice;

	Scanner sc=new Scanner(System.in);

	void input()
	{
		itemId=sc.nextInt();
		itemName=sc.next();
		quantity=sc.nextDouble();
		unitPrice=sc.nextDouble();

	}


	void display()
	{
		totalPrice=quantity*unitPrice;
		System.out.println("Total Price"+totalPrice);
			if (totalPrice<500)
			{
				System.out.println("Total Bill amount after dicount is : "+totalPrice);
			}
			else if (totalPrice>=500 && totalPrice<1000){
					System.out.println("Total Bill amount after dicount is : "+(totalPrice-(totalPrice*0.1)));
			}
			else if (totalPrice>=1000 && totalPrice<2000){
					System.out.println("Total Bill amount after dicount is : "+ (totalPrice-(totalPrice*0.12)) );
			}
			else{
				System.out.println("Total Bill amount after dicount is : "+(totalPrice-(totalPrice*0.15)));
			}
     }
}

class first
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        shop obj=new shop();
		int ch;
        while(true)
        {
			System.out.println("1.Input Data");
			System.out.println("2.Display Data");
			System.out.println("3.Exit");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
        switch(ch)
		{
			case 1 : System.out.println("Enter item Id, item Name, quantity and unit price : ");
			         obj.input();
			         break;
			case 2 : obj.display();
			         break;
			case 3: System.exit(0);
			default : System.out.println("Invalid Choice :");
			          break;
		}
	   }
	}
}

