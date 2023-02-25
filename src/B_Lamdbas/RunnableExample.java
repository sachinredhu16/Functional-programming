package B_Lamdbas;

public class RunnableExample {
    public static void main(String[] args) {
        // Prior JAVA 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
            }
        };
        new Thread(runnable).start();

        //Lambdas
        Runnable runnable1 = ()->{System.out.println("Runnable 2");};
//        Runnable runnable1 = ()->System.out.println("Runnable 2"); we can also write it
        new Thread(runnable1).start();

        new Thread(()-> System.out.println("Runnable 3")).start();

    }
}
