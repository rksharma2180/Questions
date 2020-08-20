import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class HotSpotV2 {
	private static int max = 0;
	int[][] matrix = null;
	int rowL;
	int colL;
	List<Integer> trackArray = null;
	Queue<Integer> que = (Queue<Integer>) new LinkedList<Integer>();
	
	public static void main(String[] args) {
		HotSpotV2 mainClass = new HotSpotV2();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Rows length ==> ");
		mainClass.rowL = input.nextInt();
		System.out.println("Enter Column length ==> ");
		mainClass.colL = input.nextInt();
		input.close();
		mainClass.generateMatrix();
		mainClass.printMatrix();
		mainClass.findLength();
		System.out.println("Size is " + max);
	}

	private void findLength() {
		trackArray = new ArrayList<Integer>();
		//int l= 0, r= 0, u= 0 , d = 0;
		int len ;
		int clustSize = -1;
		for (int i = 0; i < rowL; i++) {
			for (int j = 0; j < colL; j++) {
				len = 0;
				if (matrix[i][j] == 1 && !trackArray.contains(i*colL+j)) {
					len++;
					trackArray.add(i*colL+j);
					que.add(i*colL+j);
					clustSize = checkLRUD( i, j, len);
					/*if (i - 1 >= 0)
						u = checkLRUD( i-1, j, len);
					if (i + 1 < rowL)
						d = checkLRUD( i+1, j, len);
					if (j - 1 >= 0)
						l = checkLRUD( i, j-1, len);
					if (j + 1 >= 0)
						r = checkLRUD( i, j+1, len); */
					max= Math.max(max, clustSize);
				}
			}
		}
	}

	private int checkLRUD(int i, int j, int len) {
		/*int l= len, r= len, u= len , d = len;
		int maxLo = 0;
		if(matrix[i][j] == 0) {
			maxLo = Math.max(maxLo, l);
			maxLo = Math.max(maxLo, r);
			maxLo = Math.max(maxLo, u);
			maxLo = Math.max(maxLo, d);
			return maxLo;
		} else if (matrix[i][j] == 1) {
			if (i - 1 >= 0 && !checkIfAlreadyTraversed(i,j)) {
				u = checkLRUD(i-1, j, u+1);
			}
			if (i + 1 < rowL && !checkIfAlreadyTraversed(i,j)) {
				d = checkLRUD(i+1, j, d+1);
			}
			if (j - 1 >= 0 && !checkIfAlreadyTraversed(i,j)) {
				l = checkLRUD(i, j-1, l+1);
			}
			if (j + 1 >= 0 && !checkIfAlreadyTraversed(i,j)) {
				r = checkLRUD(i, j+1, r+1);
			}
		}*/
		while(!que.isEmpty()) {
			int temp = que.poll();
			i= temp/colL;
			j=temp%colL;
			if(i-1>=0 && !trackArray.contains((i-1)*colL+j) && matrix[i-1][j]==1) {
				len++;
				trackArray.add((i-1)*colL+j);
				que.add((i-1)*colL+j);
			}
			/*if(i-1>=0 && j-1>=0 && !trackArray.contains((i-1)*colL+(j-1)) && matrix[i-1][j-1]==1) {
				len++;
				trackArray.add((i-1)*colL+(j-1));
				que.add((i-1)*colL+(j-1));
			} */
			/*if(i-1>=0 && j+1<colL && !trackArray.contains((i-1)*colL+(j+1)) && matrix[i-1][j+1]==1) {
				len++;
				trackArray.add((i-1)*colL+(j+1));
				que.add((i-1)*colL+(j+1));
			} */
			if(j-1>=0 && !trackArray.contains(i*colL+(j-1)) && matrix[i][j-1]==1) {
				len++;
				trackArray.add(i*colL+(j-1));
				que.add(i*colL+(j-1));
			} 
			if(j+1<colL && !trackArray.contains(i*colL+(j+1)) && matrix[i][j+1]==1) {
				len++;
				trackArray.add(i*colL+(j+1));
				que.add(i*colL+(j+1));
			} 
			/*if(i+1<rowL && j-1>=0 && !trackArray.contains((i+1)*colL+(j-1)) && matrix[i+1][j-1]==1) {
				len++;
				trackArray.add((i+1)*colL+(j-1));
				que.add((i+1)*colL+(j-1));
			} */
			if(i+1<rowL && !trackArray.contains((i+1)*colL+j) && matrix[i+1][j]==1) {
				len++;
				trackArray.add((i+1)*colL+j);
				que.add((i+1)*colL+j);
			} 
			/*if(i+1<rowL && j+1<colL && !trackArray.contains((i+1)*colL+(j+1)) && matrix[i+1][j+1]==1) {
				len++;
				trackArray.add((i+1)*colL+(j+1));
				que.add((i+1)*colL+(j+1));
			}*/
		}
		
		return len;
	}

	private boolean checkIfAlreadyTraversed(int i, int j) {
		if (trackArray != null) {
			return trackArray.contains(i*colL+j);
		}
		return false;
	}

	private void printMatrix() {
		for (int i = 0; i < rowL; i++) {
			for (int j = 0; j < colL; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void generateMatrix() {
		// TODO Auto-generated method stub
		java.util.Random rand = new java.util.Random();
		if (matrix == null) {
			matrix = new int[rowL][colL];
		}
		for (int i = 0; i < rowL; i++) {
			for (int j = 0; j < colL; j++) {
				matrix[i][j] = rand.nextInt(2);
			}
		}
	}

}
