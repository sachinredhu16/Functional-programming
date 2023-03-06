package H_NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapTo {

    public static void main(String[] args) {
        // map to object
        List<Integer> listObject = IntStream.rangeClosed(1,10)
                .mapToObj((i)->i)
                .collect(Collectors.toList());
    }
}
