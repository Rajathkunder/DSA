import java.util.Scanner;
class Distance{
		public static void main(String args[]){
			double distance,fuel,economy;
			int ch;

			System.out.println("Enter the distance in KM");
					Scanner sc= new Scanner(System.in);
					distance=sc.nextDouble();

					System.out.println("Enter the fuel cosnumed in Litre \n");
					Scanner sc1= new Scanner(System.in);
					fuel=sc1.nextDouble();
					System.out.println("Average Fuel economy is \n"+distance/fuel+"kmpl");

					System.out.println("Choose an option \n");
					System.out.println("1.Distance estimation \n 2.Fuel estimation \n  Enter your choice 1 or 2 \n");

						Scanner sc2= new Scanner(System.in);
					ch=sc2.nextInt();
					if(ch==1){
					double fuel_cons;
					System.out.println("Enter the fuel cosnumed in Litre \n");
						Scanner sc3= new Scanner(System.in);
					fuel_cons=sc3.nextDouble();

					double res=(fuel_cons*distance)/fuel;
						System.out.println("Estimated distance is"+res);






					}
					else if(ch==2){


						double distance_cov;
											System.out.println("Enter distance in KM \n");
												Scanner sc4= new Scanner(System.in);
											distance_cov=sc4.nextDouble();

											double res=(distance_cov*fuel)/distance;
												System.out.println("Estimated Fuel is"+res);





					}
					else
					{
						System.out.println("Choose correct option \n");

					}






				//System.out.println(a+b);
		}


}