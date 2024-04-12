package N_ComparatorExample;

import java.util.Comparator;

public class ComparatorImpl implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int a = ((Student)o1).id;
        int b = ((Student)o2).id;
        if(a>b)
            return -1;
        else if(a<b)
            return 1;
        return 0;
    }
}
