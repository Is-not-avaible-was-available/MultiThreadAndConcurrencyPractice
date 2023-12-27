package Generics;

public class Pair <ONE, TWO>{
    private ONE first;
    private TWO second;

    public Pair(ONE first, TWO second){
        this.first = first;
        this.second = second;
    }

    public ONE getFirst() {
        return first;
    }

    public void setFirst(ONE first) {
        this.first = first;
    }

    public TWO getSecond() {
        return second;
    }

    public void setSecond(TWO second) {
        this.second = second;
    }
}
