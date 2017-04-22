package Chapter3;

import Chapter3.sort.ArrayBub;

public class Main4 {
    public static void main(String[] args) {
        int nMax = 50;

        ArrayBub arr = new ArrayBub(nMax);

        arr.fillRandom(nMax, 100, false);
        arr.display();

        System.out.println(arr.oddEvenSort());
        arr.display();

        arr.noDups();
        arr.display();
    }
}
