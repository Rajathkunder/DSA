public class QuadraticEquation {
    public static void main(String[] args) {
       

        // double a = Double.parseDouble(args[0]);
        // double b = Double.parseDouble(args[1]);
        // double c = Double.parseDouble(args[2]);
        double a=1;
        double b=1;
        double c=4;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
