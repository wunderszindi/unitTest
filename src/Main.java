import javax.print.attribute.IntegerSyntax;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(d);
        list2.add(b);
        list2.add(c);

        System.out.println("A felhasználói lista: " + list2);

        int uh = 4;
        Integer it = 6;
        int sz = Integer.compare(uh, it);

        System.out.println(sz);

        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            arr.add(a);
        }

        printList(arr);
        doesContain(arr, 11);
        ifContainsDelete(arr);
        doesContainLists(arr, list2);

        }

    public static void printList(ArrayList arr) {
        System.out.println(arr);
        System.out.println("A lista elemei :" + arr);
        String arr1 = arr.toString();

        System.out.println("A lista elemei: " + arr1.replace('[', ' ').replace(']', ' '));


        for (int i = 0; i < arr.size(); i++) {
            if (i==0) {
                System.out.print("A lista elemei: ");
            }
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\n");

    }
    public static boolean doesContain(ArrayList arr, int b) {
        if ( arr.contains(b)) {
            System.out.println("Tartalmazza a lista a számot!");
            return true;
        } else {
            System.out.println("A lista nem tartalmazza a számot!");
            return false;
        }
    }

    public static void ifContainsDelete(ArrayList<Integer> arr) {

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(arr.get(i));

            }
        }System.out.println("Páros számok nélkül: " + arr);

    }

    public static void doesContainLists(ArrayList<Integer> arr, ArrayList<Integer> list2) {
        if (arr.containsAll(list2)) {
            System.out.println("Tartalmazza a lista a listát!");
        }
        else {
            System.out.println("Nem tartalmazza a lista a listát!");
        }


    }
}
