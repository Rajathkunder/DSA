import java.util.Scanner;

class points
{
	private int x,y;

	points(int a,int b)
	{
		x=a;
		y=b;
	}

	double dist(points p2)
	{

		double temp;
		temp=Math.sqrt(Math.pow((x-p2.x),2)+Math.pow((y-p2.y),2));
		        return temp;
	}
	void display()
	{
		System.out.println("("+x +","+y+")");

	}
}

class distance
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		points p1,p2,p3;

		System.out.println("Input the quardinates for p1:");
		a=in.nextInt();
		b=in.nextInt();
		p1=new points(a,b);
		System.out.println("Inputthe quardinates for p2:");
		a=in.nextInt();
		b=in.nextInt();
 		p2=new points(a,b);
		System.out.println("Input the quardinates for p3:");
		a=in.nextInt();
		b=in.nextInt();
		p3=new points(a,b);
        System.out.print("p1 = ");
        p1.display();
        System.out.print("p2 = ");
        p2.display();
        System.out.print("p3 = ");
        p3.display();
		System.out.println("Distance between p1 and p2 = "+p1.dist(p2));
		System.out.println("Distance between p1 and p3 = "+p1.dist(p3));
	}
}