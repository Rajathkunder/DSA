
class TuitionFee{
		public static void main(String args[]){
			double fees=50000;
			double rate=fees*0.05;
			int i;
			for(i=1;i<=10;i++){

				fees=fees+rate;
				System.out.println("Fees after"+i+"year is"+fees);
			}
		}


}