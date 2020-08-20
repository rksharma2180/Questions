import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            System.out.println(i);
        }

        for(int j=0; j< arr.length; j++){
            System.out.println(j);
        }

        for(int k: Arrays.asList(1,2,3,4,5,6,7,78)){
            System.out.println(k);
        }

        for(int k: arr){
            System.out.println(k);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for(int j : numbers) {
            System.out.println(j);
        }


    }
}
