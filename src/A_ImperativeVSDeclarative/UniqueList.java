package A_ImperativeVSDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,5,6,6,7,8,9,9);
        System.out.println("================== Imperative ==============");
        List<Integer> res1 = new ArrayList<>();
        for(int i=0;i< list.size();i++){
            if(!res1.contains(list.get(i)))
                res1.add(list.get(i));
        }
        for(int x:res1)
            System.out.print(x+" ");

        System.out.println();
        System.out.println("================== Declarative ==============");
        List<Integer> res2 = list.stream().distinct().collect(Collectors.toList());
        for(int x:res2)
            System.out.print(x+" ");
    }
}
