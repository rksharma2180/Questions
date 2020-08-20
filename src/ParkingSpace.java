import java.util.*;

public class ParkingSpace {
	
	static Integer[][] parkingArray = new Integer[4][2];
	static Integer[][] temp = new Integer[4][2];
	static int count = 0;
	 
    public static void main(String[] args) {
		// initialize array values
		parkingArray[0][0] = 15;
		parkingArray[0][1] = 20;
		parkingArray[1][0] = 18;
		parkingArray[1][1] = 22;
		parkingArray[2][0] = 23;
		parkingArray[2][1] = 32;
		parkingArray[3][0] = 30;
		parkingArray[3][1] = 40;
	
		System.out.println("Before sorting");
		// show the contents of array
		displayArray();
		
	 	// sort the array on item id(first column)
	 	Arrays.sort(parkingArray, new Comparator<Integer[]>() {
	 	   	@Override
	                 //arguments to this method represent the arrays to be sorted   
	 		public int compare(Integer[] o1, Integer[] o2) {
	            //get the item ids which are at index 0 of the array
	            Integer itemOne = o1[0];
	            Integer itemTwo = o2[0];
	            // sort on item id
	            return itemOne.compareTo(itemTwo);
	   		}
	 	});
	 	// display array after sort
	 	System.out.println("After sorting on column-0 in ascending order");
	 	displayArray();	 	

	 	for(int i=0;i<4;i++) {
	 		for(int j=0;j<2;j++) {
	 			temp[i][j] = parkingArray[i][j];
	 		}
	 	}
   	
		for(int x=0;x<temp.length-1;x++) { 	
		 	for(int i=x+1;i<4;i++) {
		 		for(int j=0;j<1;j++) {
		 			if(temp[x][1] > parkingArray[i][j]){
		 				count++;
		 			}
		 		}
		 	}
		}
		
		
		System.out.println(count);
  
    }
  
    private static void displayArray() {
	 	System.out.println("-------------------------------------");
	 	System.out.println("Column-0\t Column-1");
	 	for (int i = 0; i < parkingArray.length; i++) {
	 		Integer[] elements = parkingArray[i];
	 		System.out.println(elements[0] + "\t\t" + elements[1]);
	 	}
		System.out.println("-------------------------------------");
    }

}
//SELECT movie,round(avg(rating),1) as average from movie_rating GROUP by movie
//order by average desc,movie asc limit 4;	
