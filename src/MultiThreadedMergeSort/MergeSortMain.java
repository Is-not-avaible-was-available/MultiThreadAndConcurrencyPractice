package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> integers = List.of(200, 99,82,11,89,0,10,17,90,100,-10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(integers, executorService);
        Future<List<Integer>> futureArr = executorService.submit(sorter);
        List<Integer> sorted = futureArr.get();

        System.out.println(sorted);
    }
}
