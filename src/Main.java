import java.lang.ref.WeakReference;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
//
//        20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
//
//        Optional.ofNullable(noteLst)
//                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
//                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
//                .map(note -> Notes::getTagName) // method reference, consider only tag name
//                .forEach(System.out::println); // it will print tag names
        int x = 10;
        System.out.println(~x);
    }
}