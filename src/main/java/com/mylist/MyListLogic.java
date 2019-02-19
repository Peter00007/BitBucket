package main.java.com.mylist;

import java.util.List;
import java.util.Vector;

/**
 * Created by User on 19.02.2019.
 */
public class MyListLogic {
    List<Integer> arraylist;
    int k = 0;

    //default constructor
    MyListLogic() {
        arraylist = new Vector<>(16);
        k = 16;
    }

    //constructor with user capacity
    MyListLogic(int n) {
        arraylist = new Vector<>(n);
        k = n;
        arraylist.add(1);
        arraylist.add(4);
        arraylist.add(11);
        arraylist.add(111);
    }

    //added element to the end of the list
    void addElement(int value) {
        if (k > arraylist.size()) {
            arraylist.add(value);
        } else {
            for (int i = 1; i < arraylist.size(); i++) {
                arraylist.set(i - 1, arraylist.get(i));
            }
            arraylist.remove(arraylist.size() - 1);
            arraylist.add(arraylist.size(), value);
        }
    }
}
