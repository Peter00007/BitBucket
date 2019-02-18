package main.java.com.bitbucket;

import java.util.ArrayList;
import java.util.Scanner;

public class BitBucketLogic {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    String validInputValues;
    String validInputPosition;
    int inputPosition;
    int counterDash;
    int counterValue;
    int inputValue;
    int addCount;
    static final char validInputChars[] = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private final String inputStringValue = "Введіть будь ласка число:";
    private final String inputStringPosition = "Введіть будь ласка число - позицію для майбутнього значення:";
    private final String incorrectlyEnteredData = "Невірно введені дані";
    private final String incorrectlyEnteredPosition = "Розмірність ArrayList менша, ніж позиція, куди повинен додаватись елемент";
    private final String inputArray = "Отриманий масив:";

    BitBucketLogic() {
        validInputValues = "";
        validInputPosition = "";
        inputPosition = 0;
        counterValue = 0;
        counterDash = 0;
        inputValue = 0;
        addCount = 0;
    }

    void inputArray() {
        System.out.println(inputArray);
        System.out.println(arrayList);
    }

    void addAndSum() {
        inputValue = Integer.parseInt(validInputValues);
        for (int i = 0; i < arrayList.size(); i++) {
            addCount = arrayList.get(i) + inputValue;
            arrayList.set(i, addCount);
        }
        arrayList.add(inputValue);
    }

    void addAndSumPosition() {
        inputValue = Integer.parseInt(validInputValues);
        inputPosition = Integer.parseInt(validInputPosition);
        for (int i = 0; i < arrayList.size(); i++) {
            addCount = arrayList.get(i) + inputValue;
            arrayList.set(i, addCount);
        }
        arrayList.add(inputPosition, inputValue);
    }

    void addValue() {
        System.out.println(inputStringValue);
        validInputValues = in.next();
        counterDash = 0;
        counterValue = 0;
        for (int i = 0; i < validInputValues.length(); i++) {
            for (int j = 0; j < validInputChars.length; j++) {
                if (validInputChars[j] == validInputValues.charAt(i)) {
                    counterValue++;
                    break;
                }
            }
            if (validInputValues.charAt(i) == '-') {
                counterDash++;
            }
        }
        if (validInputValues.length() == counterValue) {
            if (counterDash < 2) {
                if (counterDash == 0) {
                    addAndSum();
                }
                if ((counterDash == 1) && (validInputValues.charAt(0) == '-')) {
                    addAndSum();
                }
                if (counterDash == 1 && (validInputValues.charAt(0) != '-')) {
                    System.out.println(incorrectlyEnteredData);
                }
            } else {
                System.out.println(incorrectlyEnteredData);
            }
        } else {
            System.out.println(incorrectlyEnteredData);
        }
    }

    void addValueByPosition() {
        System.out.println(inputStringPosition);
        validInputPosition = in.next();
        counterValue = 0;
        for (int i = 0; i < validInputPosition.length(); i++) {
            for (int j = 1; j < validInputChars.length; j++) {
                if (validInputChars[j] == validInputPosition.charAt(i)) {
                    counterValue++;
                    break;
                }
            }
        }
        if (validInputPosition.length() == counterValue) {
            inputPosition = Integer.parseInt(validInputPosition);
            if (inputPosition <= arrayList.size()) {
                System.out.println(inputStringValue);
                validInputValues = in.next();
                counterDash = 0;
                counterValue = 0;
                for (int i = 0; i < validInputValues.length(); i++) {
                    for (int j = 0; j < validInputChars.length; j++) {
                        if (validInputChars[j] == validInputValues.charAt(i)) {
                            counterValue++;
                            break;
                        }
                    }
                    if (validInputValues.charAt(i) == '-') {
                        counterDash++;
                    }
                }
                if (validInputValues.length() == counterValue) {
                    if (counterDash < 2) {
                        if (counterDash == 0) {
                            addAndSumPosition();
                        }
                        if ((counterDash == 1) && (validInputValues.charAt(0) == '-')) {
                            addAndSumPosition();
                        }
                        if (counterDash == 1 && (validInputValues.charAt(0) != '-')) {
                            System.out.println(incorrectlyEnteredData);
                        }
                    } else {
                        System.out.println(incorrectlyEnteredData);
                    }
                } else {
                    System.out.println(incorrectlyEnteredData);
                }

            } else {
                System.out.println(incorrectlyEnteredPosition);
            }
        } else {
            System.out.println(incorrectlyEnteredData);
        }
    }
}
