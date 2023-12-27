package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;


    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            synchronized (value){
                value.val+=i;
            }
        }
        return null;
    }
}
