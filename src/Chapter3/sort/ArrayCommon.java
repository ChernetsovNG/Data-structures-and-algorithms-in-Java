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

    //удаление дубликатов (массив предварительно отсортирован)
    public void noDups() {
        long[] b = new long[a.length];
        int k = 0;

        b[k++] = a[0];

        for (int i = 1; i < nElems; i++) {
            if (a[i] != a[i-1]) {
                b[k++] = a[i];
            }
        }

        a = b;
        nElems = k;
    }

    public long get(int index) {
        return a[index];
    }

    public void sort() {
    }
}
