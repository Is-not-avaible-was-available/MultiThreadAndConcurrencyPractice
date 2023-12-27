package ProdConsSema;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Store {
    private int maxSize;
    private Vector<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new Vector<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Vector<Object> getItems() {
        return items;
    }

    public void setItems(Vector<Object> items) {
        this.items = items;
    }
    public void addItems(){
        this.items.add(new Object());
        System.out.println("Item Produced. New Count: " + this.items.size());
    }
    public void removeItem(){
        this.items.remove(0);
        System.out.println("Item Consumed. New Count: " + this.items.size());
    }
}
