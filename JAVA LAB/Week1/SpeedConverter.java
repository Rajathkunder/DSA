import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Kilometers per hour to Meters per second");
            System.out.println("2. Meters per second to Kilometers per hour");
            System.out.println("0. Exit");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Enter speed in Kilometers per hour:");
                    double kmph = scanner.nextDouble();
                    double mps = kmph * 1000.0 / 3600.0;
                    System.out.println("Speed in Meters per second: " + mps);
                    break;
                case 2:
                    System.out.println("Enter speed in Meters per second:");
                    double mpsInput = scanner.nextDouble();
                    double kmphOutput = mpsInput * 3600.0 / 1000.0;
                    System.out.println("Speed in Kilometers per hour: " + kmphOutput);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option selected.");
            }
        } while (option != 0);
        
        
    }
}
