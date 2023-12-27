package HelloWorldPrinter;

public class HWPMain {
    public static void main(String[] args) {


        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread t = new Thread(helloWorldPrinter);
        t.start();
        System.out.println("Hello World from Main " + Thread.currentThread().getName());
    }
}
