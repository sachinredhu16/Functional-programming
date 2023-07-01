package Questions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthHighest {
    public static void main(String[] args) {

        int n =2;
        Map<String,Integer> map =  new HashMap<>();
        map.put("Sachin",1000);
        map.put("Yogesh",2000);
        map.put("Mukesh",3000);
        map.put("Manish",3000);
        map.put("Hello",4000);

        Map.Entry<String,Integer> nthHighest2 = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(n-1);
        System.out.println(nthHighest2);

        Map<Integer, List<String>> collect = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        Map.Entry<Integer, List<String>> integerListEntry = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(n-1);
        System.out.println(integerListEntry);

    }
}
