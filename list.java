
import java.util.ArrayList;
import java.util.Scanner;

public class list { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Now the compiler knows this refers to java.util.ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

        // Adding some data to show it works
        list.add(10);
        list.add(20);

        System.out.println("List contents: " + list);

        // System.out.println(list.contains(10));
        // System.out.println(list.set(2, 99));
        list.remove(10);
        System.out.println(list);

        // for(int i=0;i<6;i++){
        //     list.add(sc.nextInt(i));
        }

        // System.out.println(list);

        // for(int i=0;i<6;i++){
        //     System.out.println(list.get(i));
        // }



    }

