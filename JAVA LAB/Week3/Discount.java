import java.util.Scanner;

class Shop {
    int itemID, qty;
    String itemName;
    double uprice, total;
    static double totalB = 0;

    void userInput() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter item ID: ");
        itemID = obj.nextInt();
        System.out.println("Enter Quantity: ");
        qty = obj.nextInt();
        Scanner objtxt = new Scanner(System.in);
        System.out.println("Enter item name");
        itemName = objtxt.next();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter unit price ");
        uprice = obj1.nextDouble();
        double total = qty * uprice;
        totalB = totalB + total;

        // System.out.println("Item ID: " + itemID);
        // System.out.println("Quantity: " + qty);
        // System.out.println("Unit price: " + uprice);
        // System.out.println("Total price: " + total);
        // System.out.println("-------------------");
    }
void display() {
        total = qty * uprice;
        System.out.println(" Item ID: " + itemID);
        System.out.println(" Quantity: " + qty);
        System.out.println(" Unit price: " + uprice);
        System.out.println(" Total price: " + total);
    }
    static double calculateDiscount() {
        if (totalB < 500) {
            return totalB;
        } else if (totalB >= 500 && totalB < 1000) {
            return totalB - totalB * 0.1;
        } else if (totalB >= 1000 && totalB <= 2000) {
            return totalB - totalB * 0.12;
        } else {
            return totalB - totalB * 0.15;
        }
    }
}

class Main {
    public static void main(String[] args) {
        int ch;
        int item;
        Scanner obj2 = new Scanner(System.in);
        System.out.println("How many items");
        item = obj2.nextInt();
        Shop shop[] = new Shop[item];

        do {
            System.out.println("---MENU-----");
            System.out.println("1. User Input");
            System.out.println("2. Display Data");
            System.out.println("3. Press 0 to exit");
            System.out.println("Enter your choice");

            ch = obj2.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the details of items: ");
                    for (int i = 0; i < item; i++) {
                        shop[i] = new Shop();
                        shop[i].userInput();
                    }
                    break;
                case 2:
                    System.out.println("Displaying order details");
                    for (int i = 0; i < item; i++) {
                        shop[i].display();
                    }
                    double discountedTotalBill = Shop.calculateDiscount();
        System.out.println("Total Bill (After Discount): " + discountedTotalBill);
                    break;
            }

        } while (ch != 0);

        // Display total discounted bill when exiting
        
    }
}
