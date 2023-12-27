package AdderSubtractorLock;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AddSubLockMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value= new Value();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value,lock);
        Subtractor subtractor = new Subtractor(value,lock);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Void> future1 = executorService.submit(adder);
        Future<Void> future2 = executorService.submit(subtractor);
        future2.get();
        future1.get();
        System.out.println(value.val);
    }
}
