package corejava;
import java.util.*;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array of integers
		
        int intArray[] = {5,12,14,6,19,1,23,26,35,37,7,52,86,47};
        //print original array
        System.out.println("Original array: " + Arrays.toString(intArray));
        int n = intArray.length;
        //iterate over the array comparing adjacent elements
        for (int i=0; i<=n-1; i++)
            for (int j = 0; j<=n-i-1; j++)
                //if elements not in order, swap them    
                if (intArray[j]>=intArray[j+1])  {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
        //print the sorted array        
        System.out.println("Sorted array: " + Arrays.toString(intArray));


	}

}
