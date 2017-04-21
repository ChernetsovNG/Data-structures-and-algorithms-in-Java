package Chapter3.sort;

public class ArrayIns extends ArrayCommon {
    public ArrayIns(int max) {
        super(max);
    }

    private void insertionSort() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in-1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public long median() {
        ArrayIns tmpArr = new ArrayIns(nElems);
        for (int i = 0; i < nElems; i++) {
            tmpArr.insert(a[i]);
        }
        tmpArr.insertionSort();

        if (nElems % 2 == 1) {
            return tmpArr.get(nElems/2);
        } else {
            return (tmpArr.get(nElems/2) + tmpArr.get((nElems/2) - 1))/2;
        }
    }

    public void sort() {
        this.insertionSort();
    }

}
