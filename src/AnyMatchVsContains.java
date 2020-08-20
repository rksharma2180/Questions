
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class AnyMatchVsContains {

    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.contains(1));

        Stream<List<Integer>> list1 = Stream.of(list);

    }
}

