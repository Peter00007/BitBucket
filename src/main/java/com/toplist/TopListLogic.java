package main.java.com.toplist;

import java.util.ArrayList;
import java.util.List;

public class TopListLogic {
    List<Integer> arrayList;

    int counterValue;
    int count;
    int maxElement;
    int minElement;
    boolean flag;
    double arithmeticMean;

    TopListLogic() {
        arrayList = new ArrayList<>();
        counterValue = 0;
        count = -1;
        arithmeticMean = 0;
        flag = false;
        /*arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(-10);
        arrayList.add(110);
        arrayList.add(4);*/
        arrayList.add(1);
        arrayList.add(5);
    }

    boolean checkNull() {
        if (arrayList.equals(null)) {
            return true;
        } else
            return false;
    }

    //added by value
    void addByValue(int value) {
        if (checkNull()) {
            arrayList.add(value);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                counterValue = arrayList.get(i) + value;
                arrayList.set(i, counterValue);
            }
            arrayList.add(value);
        }
    }

    //added by position
    void addByPosition(int position, int value) {
        if (position >= 0 && position <= arrayList.size()) {
            if (checkNull() == false) {
                for (int i = 0; i < arrayList.size(); i++) {
                    counterValue = arrayList.get(i) + value;
                    arrayList.set(i, counterValue);
                }
                arrayList.add(position, value);
            }
            if (position == 0 && checkNull() == true) {
                arrayList.add(position, value);
            }
        }
    }

    //remove by position
    void removeElementByPosition(int position) {
        if ((checkNull() == false) && (position >= 0) && (position < arrayList.size())) {
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
    }

    //remove by value
    void removeElementByValue(int value) {
        if (checkNull() == false) {
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
    }


    //search element by position
    boolean searchByPosition(int position) {
        if ((checkNull() == false) && (position >= 0) && (position < arrayList.size())) {
            return true;
        }
        else return false;
    }

    //search element by value
    boolean searchByValue(int value) {
        if (checkNull() == false) {
            return arrayList.contains(value);
        } else
            return false;
    }

    //search max element
    int searchMaxElement() {
        if (checkNull() == false) {
            maxElement = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (maxElement < arrayList.get(i)) {
                    maxElement = arrayList.get(i);
                }
            }
            return maxElement;
        } else
            return maxElement;
    }

    //search min element
    int searchMinElement() {
        if (checkNull() == false) {
            minElement = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) < minElement) {
                    minElement = arrayList.get(i);
                }
            }
            return minElement;
        } else
            return minElement;
    }

    //search average arithmetic
    double arithmeticAverage() {
        if (checkNull() == false) {
            for (int i = 0; i < arrayList.size(); i++) {
                arithmeticMean += arrayList.get(i);
            }
            arithmeticMean /= arrayList.size();
            return arithmeticMean;
        } else
            return arithmeticMean;
    }
}
