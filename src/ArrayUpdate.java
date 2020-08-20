import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int x = Integer.parseInt(s.nextLine());
	        int [] arr = new int[x];	        
	        int sum = 0, min  = 0;
	        
	        for(int i=0 ; i <x; i++) {
	        	if(s.hasNextLine()) {
	        		if(s.hasNextInt()) {
	        			arr[i] = s.nextInt();
	        			sum += arr[i];
	        		}
	        	}	
	        }
	        System.out.println(sum);
	        System.out.println(sum / arr.length);
	        min = (sum / arr.length) + 1;
	        
		/*
		 * Arrays.sort(arr);
		 * 
		 * for(int i=arr.length-1; i >= arr.length / 2 ; i--) { if((arr[i] * arr.length)
		 * > sum) { min = arr[i]; } }
		 */
	        System.out.println(min);
	        
	}	

}
