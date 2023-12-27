package HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{

    public void doSomething(){
        System.out.println("Hello world from do Something." + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello World from Thread!" + Thread.currentThread().getName());
        doSomething();
    }
}
