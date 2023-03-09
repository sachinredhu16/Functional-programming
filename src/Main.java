import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String s = 1+"/"+2;
        list.add(s);
        if(list.contains(s))
            System.out.println("contains");

    }
}