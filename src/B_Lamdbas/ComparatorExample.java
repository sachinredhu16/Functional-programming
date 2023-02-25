package B_Lamdbas;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("without lambdas : "+comparator.compare(3,5));

        // using lambdas
        Comparator<Integer> comparator1 = (Integer a,Integer b)->a.compareTo(b);
//        Comparator<Integer> comparator1 = (a,b)->a.compareTo(b);
        System.out.println("with lambdas : "+comparator.compare(3,5));
    }
}
