package ProdConsSema;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ProdConsSemaMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i= 1;i<=8;i++){
            executorService.execute(new Producer(store,producerSemaphore,consumerSemaphore));
        }
        for(int i =  1;i<=20;i++){
            executorService.execute(new Consumer(store, producerSemaphore,consumerSemaphore));
        }
    }
}
