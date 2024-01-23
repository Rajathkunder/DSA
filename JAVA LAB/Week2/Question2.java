import java.util.Scanner;
import java.util.Arrays;
public class Question2{
	  public static void main(String[] args) {
			int size,i;
		  	Scanner obj = new Scanner(System.in);

        	System.out.println("Enter size of the array: ");
          	size = obj.nextInt();

		    int[] array = new int[size];
		    System.out.println("Enter elements: ");
			for (i = 0; i < size; i++) {
			         array[i] = obj.nextInt();
			    }

			System.out.println("Array elements are: ");
			for (i = 0; i < array.length; i++) {
			         System.out.print(array[i] + " ");
			    }
        	System.out.println();

        	//int[] SortedArray=new int[array.length];
        	//SortedArray=Arrays.sort(array[]);
        	Arrays.sort(array);
			//for (i = 0; i < SortedArray.length; i++) {
			//			         System.out.print(SortedArray[i] + " ");
			  //  }
			  System.out.println("Sorted Array is: ");
			  for (i = 0; i < array.length; i++) {
			  			         System.out.print(array[i] + "\n");
			    }
			    System.out.println("Pairs are \n");
			    int count=0;
			    System.out.println("{");
			    for(i=array.length-1;i>=0;i--){

					for(int j=i-1;j>=0;j--){
					// System.out.println("("+i+","+j+")");
					System.out.println("("+array[i]+","+array[j]+"),"+" ");
				 }

				}
				System.out.println("}");








	  }
}

