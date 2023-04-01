package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,56,77,54);
        IntSummaryStatistics num = list.stream().mapToInt(x->x).summaryStatistics();

        System.out.println(num);
    }
}
