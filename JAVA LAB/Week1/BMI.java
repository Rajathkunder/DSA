import java.util.Scanner;
class BMI{
	public static void main(String[] args){
		double height,weight,result;
		System.out.println("Enter the Weight in Kilogram \n");
		Scanner sc= new Scanner(System.in);
		weight=sc.nextDouble();

		System.out.println("Enter the Height in CentimMeter \n");
		Scanner sc1= new Scanner(System.in);
		height=sc1.nextDouble();
		double heightInCm=height/100;
		System.out.println("heigth is"+heightInCm);

		result=weight/(heightInCm*heightInCm);
		System.out.println("Resultant BMI is"+result);

		if(result<18.5){
			System.out.println("Interpretation is UnderWeight");
		}
		else if(result>=18.5&&result<=24.9){
			System.out.println("Interpretation is Normal");
		}
		else if(result>=25&&result<=29.9){

			System.out.println("Interpretation is OverWeight");
		}
		else{
			System.out.println("Interpretation is Obese");

		}


		//System.out.println("value is \n"+val);
	}


}