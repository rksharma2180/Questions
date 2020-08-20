import java.util.*;

public class HotSpot {
	static Set<String> set = new HashSet<String>();
	static int[][] area = { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(area[i][j]);
			}
			System.out.println("");
		}

		System.out.println("Starting solution \n");
		int result = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (area[i][j] != 0 && !set.contains("R" + i + "-C" + j)) {
					System.out.println("Sending Row: "+i+" Column: "+j);
					getCoordinates(i, j);
					if (result < set.size()) {
						result = set.size();
					}
				}
				set.clear();
			}
			System.out.println("");
		}
		System.out.println("Result is: " + result);

	}

	public static void getCoordinates(int row, int column) {
		if (set.contains("R" + row + "-C" + column))
			return;

		set.add("R" + row + "-C" + column);
		if (column - 1 >= 0 && area[row][column - 1] != 0) {
			getCoordinates(row, column - 1);
		}

		if (row - 1 >= 0 && area[row - 1][column] != 0) {
			getCoordinates(row - 1, column);
		}

		if (row + 1 < 3 && area[row + 1][column] != 0) {
			getCoordinates(row + 1, column);
		}

		if (column + 1 < 3 && area[row][column + 1] != 0) {
			getCoordinates(row, column + 1);
		}
	}
}