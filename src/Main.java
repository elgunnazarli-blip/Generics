import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> StudentInfo = new HashMap<Integer, String>();

        StudentInfo.put(101,"Ali");
        StudentInfo.put(102,"Vali");
        StudentInfo.put(103,"Aysel");
        StudentInfo.put(104,"Nigar");
        StudentInfo.put(102,"Elvin");

        System.out.println(StudentInfo.get(103));
        System.out.println(StudentInfo.getOrDefault(999,"Tapılmadı"));
        System.out.println(StudentInfo.containsKey(105));
        System.out.println(StudentInfo.remove(101));
        System.out.println(StudentInfo.remove(500));
        System.out.println(StudentInfo.size());


    }
}