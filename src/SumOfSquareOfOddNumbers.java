import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        int sum = list
                .stream()
                .filter(n -> n % 2 != 0) //1,3,5,7,9
                .map(n -> Math.pow(n, 2)) //1 + 9 + 25 + 49 + 81
                .mapToInt(Double::intValue)
                .sum();
        System.out.println(sum);

         sum = list
                .stream()
                .filter(n -> n % 2 != 0) //1,3,5,7,9
                .map(n -> Math.pow(n, 2)) //1 + 9 + 25 + 49 + 81
                .collect(Collectors.summingInt(Double::intValue));
        System.out.println(sum);
    }

}
