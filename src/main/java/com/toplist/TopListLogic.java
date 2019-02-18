package main.java.com.toplist;

import java.util.ArrayList;
import java.util.List;

public class TopListLogic {
    List<Integer> arrayList;

    int counterValue;
    int count;
    int maxElement;
    int minElement;
    double arithmeticMean;

    TopListLogic() {
        arrayList = new ArrayList<>();
        counterValue = 0;
        count = -1;
        arithmeticMean = 0;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(-10);
        arrayList.add(110);
        arrayList.add(4);
    }

    //added by value
    void addByValue(int value) {
        for (int i = 0; i < arrayList.size(); i++) {
            counterValue = arrayList.get(i) + value;
            arrayList.set(i, counterValue);
        }
        arrayList.add(value);
    }

    //added by position
    void addByPosition(int position, int value) {
        for (int i = 0; i < arrayList.size(); i++) {
            counterValue = arrayList.get(i) + value;
            arrayList.set(i, counterValue);
        }
        arrayList.add(position, value);
    }

    //remove by position
    void removeElementByPosition(int position) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == position) {
                continue;
            }
            counterValue = arrayList.get(position);
            counterValue = arrayList.get(i) - counterValue;
            arrayList.set(i, counterValue);
        }
        arrayList.remove(position);
    }

    //remove by value
    void removeElementByValue(int value) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(value)) {
                count = i;
                break;
            }
        }
        if (count != -1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == count) {
                    continue;
                }
                counterValue = arrayList.get(i) - value;
                arrayList.set(i, counterValue);
            }
            arrayList.remove(arrayList.get(count));
        }
    }


    //search element by position
    int searchByPosition(int position) {
        return arrayList.get(position);
    }

    //search element by value
    boolean searchByValue(int value) {
        return arrayList.contains(value);
    }

    //search max element
    int searchMaxElement() {
        maxElement = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxElement < arrayList.get(i)) {
                maxElement = arrayList.get(i);
            }
        }
        return maxElement;
    }

    //search min element
    int searchMinElement() {
        minElement = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < minElement) {
                minElement = arrayList.get(i);
            }
        }
        return minElement;
    }

    //search average arithmetic
    double arithmeticAverage() {
        for (int i = 0; i < arrayList.size(); i++) {
            arithmeticMean += arrayList.get(i);
        }
        arithmeticMean /= arrayList.size();
        return arithmeticMean;
    }
}
