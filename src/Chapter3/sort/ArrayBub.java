package Chapter3.sort;

public class ArrayBub extends ArrayCommon {
    public ArrayBub(int max) {
        super(max);
    }

    public int bubbleSort() {
        int in;
        int outRight;
        int outLeft = 0;
        nOps = 0;

        for (outRight = nElems-1; outRight > outLeft; outRight--) {
            for (outLeft = 0; outLeft < outRight; outLeft++) {

                for (in = outLeft; in < outRight; in++) {
                    if (a[in] > a[in + 1]) {
                        swap(in, in + 1);
                        nOps++;
                    }
                }

                for (in = outRight-1; in > outLeft; in--) {
                    if (a[in] < a[in - 1]) {
                        swap(in, in - 1);
                        nOps++;
                    }
                }
            }
        }

        return nOps;
    }

    //Метод чётно-нечётных перестановок
    public int oddEvenSort() {
        int i;
        int N_swap_1;
        int N_swap_2;
        nOps = 0;

        do {
            N_swap_1 = 0;
            N_swap_2 = 0;

            for (i = 1; i < nElems; i += 2) {
                if (i+1 >= nElems)
                    break;
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    N_swap_1++;
                    nOps++;
                }
            }

            for (i = 0; i < nElems; i += 2) {
                if (i+1 >= nElems)
                    break;
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    N_swap_2++;
                    nOps++;
                }
            }
        }
        while (N_swap_1 > 0 && N_swap_2 > 0);

        return nOps;
    }

}
