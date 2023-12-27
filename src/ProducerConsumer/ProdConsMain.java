package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProdConsMain {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i =1;i<=8;i++){
            executorService.execute(new Producer(store));
        }
        for(int i=1;i<=20;i++){
            executorService.execute(new Consumer(store));
        }


    }
}
