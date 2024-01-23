import java.util.Scanner;
class Box {
    private double width;
    private double height;
    private double depth;


    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }





    double calculateVolume() {
        return width * height * depth;
    }
}

class BoxProblem{
public static void main(String args[]){
double h,w,d,vol;
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter height:");
 h=obj.nextDouble();
  System.out.println("Enter width:");
 w=obj.nextDouble();
  System.out.println("Enter depth:");
 d=obj.nextDouble();
 Box newob=new Box(w,h,d);
 System.out.println(" volume of the box :\n");
 vol=newob.calculateVolume();
 System.out.println(vol);



}

}