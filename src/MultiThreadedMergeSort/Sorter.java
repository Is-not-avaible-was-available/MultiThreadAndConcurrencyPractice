package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>{
    private List<Integer> arrToSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> arrToSort, ExecutorService executorService) {
        this.arrToSort = arrToSort;
        this.executorService  = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size()<=1){
            return arrToSort;
        }
        List<Integer> leftArrtoSort = new ArrayList<>();
        List<Integer> rightArrtoSort = new ArrayList<>();
        int N = arrToSort.size();
        int mid = arrToSort.size()/2;

        for(int i=0;i<mid;i++){
            leftArrtoSort.add(arrToSort.get(i));
        }
        for(int i=mid;i<N;i++){
            rightArrtoSort.add(arrToSort.get(i));
        }

        Sorter leftSortingTask = new Sorter(leftArrtoSort, executorService);
        Sorter rightSortingTask = new Sorter(rightArrtoSort, executorService);

        Future<List<Integer>> futureLeftArr = executorService.submit(leftSortingTask);
        Future<List<Integer>> futureRightArr = executorService.submit(rightSortingTask);

        List<Integer> leftSortedArr = futureLeftArr.get();
        List<Integer> rightSortedArr = futureRightArr.get();

        List<Integer> finalSortedArr = new ArrayList<>();
        int i= 0;
        int j = 0;
        while (i< leftSortedArr.size() && j< rightSortedArr.size()){
            if(leftSortedArr.get(i)<= rightSortedArr.get(j)){
                finalSortedArr.add(leftSortedArr.get(i));
                i++;
            }else{
                finalSortedArr.add(rightSortedArr.get(j));
                j++;
            }
        }
        while(i< leftSortedArr.size()){
            finalSortedArr.add(leftSortedArr.get(i));
            i++;
        }
        while (j<rightSortedArr.size()){
            finalSortedArr.add(rightSortedArr.get(j));
            j++;
        }
        return finalSortedArr;
    }
}
