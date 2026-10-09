import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Box<String> box = new Box<>("Salam");

        System.out.println(box.getValue());
        System.out.println(box.isEmpty());

        box.setValue(null);
        System.out.println(box.getValue());


        Pair<String, Integer> pair = new Pair<>("Age",23);
        System.out.println(pair);
    }
}