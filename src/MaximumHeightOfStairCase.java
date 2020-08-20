public class MaximumHeightOfStairCase {

    public static void main(String[] args) {
        System.out.println(maxHeightStaircase("8"));
    }

    static String maxHeightStaircase(String input) {
        if (input == null || input.isEmpty())
            return "0";

        int numberOfBlocks = Integer.parseInt(input);
        int maxHeight = (int) Math.sqrt(numberOfBlocks * 2.0);

        System.out.println("max height : "+ maxHeight);

        int tMaxHeight = (maxHeight * (maxHeight + 1)) / 2;
        if ( tMaxHeight > numberOfBlocks  ) {
            maxHeight--;
        }
        return "" + maxHeight;
    }
}
