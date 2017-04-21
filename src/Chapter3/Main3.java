package Chapter3;

import Chapter3.sort.ArrayIns;

public class Main3 {
    public static void main(String[] args) {
        ArrayIns arr = new ArrayIns(100);

        arr.insert(1);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(5);
        arr.insert(5);
        arr.insert(5);
        arr.insert(7);

        arr.display();

        arr.noDups();

        arr.display();
    }
}
