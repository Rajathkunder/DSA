import java.util.Scanner;

class Customer {
     int cust_id,bill_no,numofcalls;
    String name;
    String phone_no;
    double bill_amount;

    Customer(int id, String nm, String ph, int bn, int nc) {
        cust_id = id;
        name = nm;
        phone_no = ph;
        bill_no = bn;
        numofcalls = nc;
        bill_amount = 0;
    }

     void Calculate_bill_amt() {
        if (numofcalls <= 100) {
            bill_amount = 100;
        } else if (numofcalls <= 150) {
            bill_amount = 100 + 0.6 * (numofcalls - 100);
        } else if (numofcalls <= 200) {
            bill_amount = 100 + 0.6 * 50 + 0.5 * (numofcalls - 150);
        } else {
            bill_amount = 100 + 0.6 * 50 + 0.5 * 50 + 0.4 * (numofcalls - 200);
        }
    }

     void displayDetails() {
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone_no);
        System.out.println("Bill Number: " + bill_no);
        System.out.println("Number of Calls: " + numofcalls);
        System.out.println("Bill Amount: Rs. " + bill_amount);
    }
}

class telephone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Customer " + (i+1) + ":");
            System.out.print("Customer ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String nm = sc.next();
            System.out.print("Phone Number: ");
            String ph = sc.next();
            System.out.print("Bill Number: ");
            int bn = sc.nextInt();
            System.out.print("Number of Calls: ");
            int nc = sc.nextInt();

            customers[i] = new Customer(id, nm, ph, bn, nc);
            customers[i].Calculate_bill_amt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Customer " + (i+1) + ":");
            customers[i].displayDetails();
        }

    }
}
