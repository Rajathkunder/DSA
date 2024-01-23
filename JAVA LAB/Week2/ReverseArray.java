


import java.util.Scanner;

public class ReverseArray {
	   static int reverse(int n)
			    {

			        int rev = 0;

			        int rem;

			        while (n > 0) {
			            rem = n % 10;
			            rev = (rev * 10) + rem;
			            n = n / 10;
			        }

			        return rev;
    }
    public static void main(String[] args) {



		int size, i;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        size = obj.nextInt();

		        int[] array = new int[size];
        int[] revArray = new int[size];

        System.out.println("Enter elements: ");
        for (i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        System.out.println("Array elements are: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


         System.out.println("reverse is\n");
		for (i = 0; i < array.length; i++) {
					int rev=reverse(array[i]);
		            System.out.print(rev + " \n");
        }

    }
}
