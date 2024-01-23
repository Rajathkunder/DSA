import java.util.*;
class Box{
float width,height,depth,vol;
Box(float w,float h,float d)
{
width=w;
height=h;
depth=d;
}
void volume()
{
vol=width*height*depth;
System.out.println("Volume of the box is : "+vol+" cm^3");
}
}

class third
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter width ,height and depth of the box in cm : ");
	float w=sc.nextFloat();
	float h=sc.nextFloat();
	float d=sc.nextFloat();
	Box obj=new Box(w,h,d);
	obj.volume();
}
}
