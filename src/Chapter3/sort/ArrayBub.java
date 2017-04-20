package Chapter3.sort;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
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

    public void bubbleSort() {
        int in;
        int outRight;
        int outLeft = 0;

        for (outRight = nElems-1; outRight > outLeft; outRight--) {
            for (outLeft = 0; outLeft < outRight; outLeft++) {

                for (in = outLeft; in < outRight; in++) {
                    if (a[in] > a[in + 1]) {
                        swap(in, in + 1);
                    }
                }

                for (in = outRight-1; in > outLeft; in--) {
                    if (a[in] < a[in - 1]) {
                        swap(in, in - 1);
                    }
                }
            }
        }

    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
