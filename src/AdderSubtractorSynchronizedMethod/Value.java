package AdderSubtractorSynchronizedMethod;

public class Value {
    public int val = 0;


    public synchronized void incrementBy(int num){
        this.val+=num;
    }
    public synchronized void  decrementBy(int num){
        this.val-=num;
    }
}
