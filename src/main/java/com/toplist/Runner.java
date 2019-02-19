package main.java.com.toplist;

/**
 * Created by User on 16.02.2019.
 */
public class Runner {
    public static void main(String[] args) {
        TopListLogic topListLogic = new TopListLogic();
        topListLogic.addByValue(3);
        topListLogic.addByPosition(2,5);
        topListLogic.removeElementByPosition(3);
        topListLogic.removeElementByValue(-13);
        System.out.println(topListLogic.searchByPosition(4));
        System.out.println(topListLogic.searchByValue(11));
        System.out.println(topListLogic.searchMinElement());
        System.out.println(topListLogic.searchMaxElement());
        System.out.println(topListLogic.arithmeticAverage());
        System.out.println(topListLogic.searchByValue(2));
    }
}
