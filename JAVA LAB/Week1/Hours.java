import java.util.Scanner;
class Hours{
 	public static void main(String[] args){
		int hrs,rate;
 		System.out.println("Enter no of hours worked\n");
 		Scanner sc2= new Scanner(System.in);
					hrs=sc2.nextInt();

		System.out.println("Enter hourly rate");
		 		Scanner sc3= new Scanner(System.in);
					rate=sc3.nextInt();

			if(hrs<=40){
				System.out.println("the total pay is"+hrs*rate);

			}else if(hrs>40){
				int excess=hrs-40;
				System.out.println("extra time is"+excess);

				int new_rate=rate/2;
				System.out.println("new rate is"+new_rate);
				int res=(40*rate)+(excess*new_rate);
				System.out.println("the total pay is"+res);

			}


 	}

}