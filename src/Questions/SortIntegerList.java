package Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2)
            return 1;
        else if (o1<o2)
            return -1;
        return 0;
    }
}

public class SortIntegerList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,7,3,9,2,0,4,6);
        list.sort(new CustomComparator());
        System.out.println(list);
    }
}
