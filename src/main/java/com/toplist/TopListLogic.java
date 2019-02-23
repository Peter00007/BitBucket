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
        arrayList.add(1);
        arrayList.add(5);
    }

    //added by value
    void addByValue(int value) {
        if (arrayList.size() == 0) {
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
        try {
            if (position < 0 || position > arrayList.size()) {
                throw new InvalidIndexException("Недопустиме значення індексу");
            }
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    counterValue = arrayList.get(i) + value;
                    arrayList.set(i, counterValue);
                }
                arrayList.add(position, value);
            }
            if (position == 0 && (arrayList.size() == 0)) {
                arrayList.add(position, value);
            }
        } catch (InvalidIndexException e) {
            System.out.println("Exception = " + e + " " + position);
        }
    }

    //remove by position
    void removeElementByPosition(int position) {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Видалення елемента із порожної колекції");
            }
            if (position < 0 || position > arrayList.size() - 1) {
                throw new InvalidIndexException("Недопустиме значення індексу");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == position) {
                    continue;
                }
                counterValue = arrayList.get(position);
                counterValue = arrayList.get(i) - counterValue;
                arrayList.set(i, counterValue);
            }
            arrayList.remove(position);
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        } catch (InvalidIndexException e) {
            System.out.println("Exception :" + e + " " + position);
        }
    }

    //remove by value
    void removeElementByValue(int value) {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Видалення елемента із порожної колекції");
            }
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
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        }
    }


    //search element by position
    boolean searchByPosition(int position) {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Пошук елемента у порожній колекції");
            }
            if (position < 0 || position > arrayList.size() - 1) {
                throw new InvalidIndexException("Недопустимий індекс");
            }
            return true;
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        } catch (InvalidIndexException e) {
            System.out.println("Exception :" + e + " " + position);
        }
        return false;
    }

    //search element by value
    boolean searchByValue(int value) {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Пошук елемента у порожній колекції");
            }
            return arrayList.contains(value);
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        }
        return false;
    }

    //search max element
    int searchMaxElement() {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Пошук максимального елемента у порожній колекції");
            }
            maxElement = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (maxElement < arrayList.get(i)) {
                    maxElement = arrayList.get(i);
                }
            }
            return maxElement;
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        }
        return maxElement;
    }

    //search min element
    int searchMinElement() {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Пошук мінімального елемента у порожній колекції");
            }
            minElement = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) < minElement) {
                    minElement = arrayList.get(i);
                }
            }
            return minElement;
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        }
        return minElement;
    }

    //search average arithmetic
    double arithmeticAverage() {
        try {
            if (arrayList.size() == 0) {
                throw new EmptyCollectionException("Пошук мінімального елемента у порожній колекції");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                arithmeticMean += arrayList.get(i);
            }
            arithmeticMean /= arrayList.size();
            return arithmeticMean;
        } catch (EmptyCollectionException e) {
            System.out.println("Exception :" + e);
        }
        return arithmeticMean;
    }
}
