package L_DefaultAndStaticInterface;

import java.util.*;


class LengthComparator implements Comparator<String>{

    // for ascending order
    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length())
            return 1;
        else if(o1.length()<o2.length())
            return -1;
        return 0;
    }

}

public class A_DefaultInterface {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Adam","Denny","Ran","Amicably","Night","Arony");
        // Prior JAVA 8
        Collections.sort(list);
        System.out.println("Sorted list is : "+list);

        // POST JAVA 8

        // sort on the basis of length
        LengthComparator com = new LengthComparator();
        list.sort(com);
        System.out.println("Sorted on the basis of length : "+list);

        // sort in ascending order
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list in ascending order : "+list);

        // sort in descending order
        list.sort(Comparator.reverseOrder());
        System.out.println("Sorted list in  descending order : "+list);
    }
}
