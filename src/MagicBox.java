public class MagicBox <T> {


    private int maxAmount;
    T[] items;

    public MagicBox(int maxAmount) {
        this.maxAmount = maxAmount;
        items = (T[]) new Object[maxAmount];
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    public void print(){
        for (int i = 0; i < items.length; i++){
            System.out.print(items[i] + " ");
            }
        System.out.println();
    }
}
