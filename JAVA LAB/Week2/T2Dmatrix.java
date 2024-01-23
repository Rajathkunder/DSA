import java.util.Scanner;
import java.util.Arrays;
public class T2Dmatrix{

	public static void main(String[] args) {
				int size,m,n,i,j;
			  	Scanner obj = new Scanner(System.in);

	        	System.out.println("Enter row and column size of the matrix: \n");
	          	m = obj.nextInt();
				n = obj.nextInt();
			    int[][] array = new int[m][n];
			    System.out.println("Enter elements: ");
				for(i = 0; i < m; i++) {
						for(j=0;j<n;j++){
				         array[i][j] = obj.nextInt();
					 }
				    }

				System.out.println("Array elements are: ");
				for(i = 0; i < m; i++) {
						for(j=0;j<n;j++){
							 System.out.println(array[i][j]+" ");
						}
						System.out.println();

				    }
        	System.out.println();


		int highest=array[0][0];
		int lowest=array[0][0];
		int hrowno=0,hcolno=0,lrowno=0,lcolno=0;

		for(i = 0; i < m; i++) {
						for(j=0;j<n;j++){
							if(array[i][j]<lowest){
								lowest=array[i][j];
								lrowno=i;
								lcolno=j;
							}
							if(array[i][j]>highest)
							{
								highest=array[i][j];
								hrowno=i;
								hcolno=j;
							}



						}
					}
				System.out.println("Highest is "+highest+" "+"Dimensions are ("+hrowno+","+hcolno+")");
				System.out.println("Lowest is "+lowest+" "+"Dimensions are ("+lrowno+","+lcolno+")");


}


}




