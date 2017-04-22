package Chapter3;

import Chapter3.sort.ArrayBub;

public class Main1 {
    public static void main(String[] args) {
        int maxSize = 50;
        ArrayBub arr = new ArrayBub(maxSize);

        arr.fillRandom(maxSize, 1000);

        arr.display();

        arr.sort();

        arr.display();
    }
}
