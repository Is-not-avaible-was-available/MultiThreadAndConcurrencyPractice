package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddSubMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Void> future = executorService.submit(adder);
        Future<Void>future1 = executorService.submit(subtractor);

        future1.get();
        future.get();
        System.out.println(value.val);

    }
}
