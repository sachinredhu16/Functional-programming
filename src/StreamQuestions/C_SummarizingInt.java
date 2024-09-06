package StreamQuestions;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class C_SummarizingInt {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(collect);
    }
}
