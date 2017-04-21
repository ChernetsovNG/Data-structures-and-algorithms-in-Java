package Chapter3;

import Chapter3.sort.ArrayBub;

public class Main1 {
    public static void main(String[] args) {
        int maxSize = 11;
        ArrayBub arr = new ArrayBub(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long) (Math.random() * 100);
            arr.insert(n);
        }

        arr.display();

        arr.sort();

        arr.display();
    }
}
