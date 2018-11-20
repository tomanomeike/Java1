package lt.bt.Testas;

public class Uzduotis4 {


	public static void main(String[] args) {
		int[] myArray = {3, 5, 7, 34, 1, 3, 6, 8, 8, 5};
		int i, j;
		int times=0;
		new_array=0;
		for( i = 0; i < myArray.length; i++){
			
			 System.out.println("Skaiciai, kurie kartojasi :"); 
		        for (i = 0; i < myArray.length; i++)  
		        { 
		            for (j = i + 1; j < myArray.length; j++)  
		            { 
		                if (myArray[i] == myArray[j])  
		                    System.out.print(myArray[i] + " "); 
		            } 
		        } 
		        for ( j = 0; j < myArray.length; j++) {
		            for ( i = j; i < myArray.length; i++) {
		                if (myArray[j] == myArray[i] && j != i) {
		                    new_array[i] = myArray[i];
		                    times[i]++;
		                }
		            }
		}

	}
}
