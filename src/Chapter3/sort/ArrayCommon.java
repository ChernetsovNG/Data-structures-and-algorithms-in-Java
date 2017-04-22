package Chapter3.sort;

public class ArrayCommon {
    protected long[] a;
    protected int nElems;
    protected int nOps;

    public ArrayCommon(int max) {
        a = new long[max];
        nElems = 0;
        nOps = 0;
    }

    //заполняем массив nRandom случайными числами от -rightBorder до rightBorder
    public void fillRandom(int nRandom, long rightBorder, boolean onlyPositive) {
        if (nRandom > a.length) {
            throw new IndexOutOfBoundsException("Must be nRandom <= nMax");
        }
        //"обнуляем" старый массив
        a = new long[a.length];
        nElems = 0;

        if (onlyPositive) {
            for (int i = 0; i < nRandom; i++) {
                long n = (long) (Math.random() * rightBorder);
                this.insert(n);
            }
        } else {
            for (int i = 0; i < nRandom; i++) {
                long n = (long) (-rightBorder + Math.random() * rightBorder * 2);
                this.insert(n);
            }
        }

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

}
