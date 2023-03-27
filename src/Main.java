import java.util.ArrayList;
import java.util.List;


public class Main {
    static int fun(){
        int i=0;
        return ++i;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Main main2 = new Main();
        Main main1 = main;
        System.out.println(main2.equals(main1));
    }
   }