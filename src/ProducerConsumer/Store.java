package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }
    public void addItem(){
        this.items.add(new Object());
        System.out.println("Item Produced. New Count: " + this.items.size());
    }
    public void removeItem(){
        this.items.remove(0);
        System.out.println("Item Consumed. New Count: " + this.items.size());
    }
}
