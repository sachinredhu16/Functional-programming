package Question1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class try1 {
    public static void main(String[] args) {
        // convert List of objects into a Map by considering duplicated keys and
        // store them in sorted order
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(1, "temp", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

        Map<Integer, List<Notes>> collect = noteLst.stream().sorted(Comparator.comparingInt(Notes::getId)).collect(
                Collectors.groupingBy(Notes::getId));

        System.out.println(collect);

    }
}
