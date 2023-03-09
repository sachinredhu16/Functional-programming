package J_ParallelStream;

public class Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void doAdd(int input){
        this.total += input;
    }
}
