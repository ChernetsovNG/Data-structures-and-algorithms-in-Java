package Chapter3.sort;

public class ArrayBub extends ArrayCommon {
    public ArrayBub(int max) {
        super(max);
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

}
