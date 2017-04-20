package Chapter3.sort;

public class ArrayCommon {
    protected long[] a;
    protected int nElems;

    public ArrayCommon(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    protected void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public long get(int index) {
        return a[index];
    }
}
