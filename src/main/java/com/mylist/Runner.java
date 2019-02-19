package main.java.com.mylist;

/**
 * Created by User on 19.02.2019.
 */
public class Runner {
    public static void main(String[] args) {
        MyListLogic myListLogic = new MyListLogic(7);
        myListLogic.addElement(1);
        myListLogic.addElement(2);
        myListLogic.addElement(3);
        myListLogic.addElement(3);
        myListLogic.addElement(3);
        myListLogic.addElement(3);
        myListLogic.addElement(3);
        myListLogic.addElement(3);
        System.out.println(myListLogic.arraylist);
    }
}
