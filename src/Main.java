import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();

        int[] exp = new Random().ints(limit, -100, 100).toArray();
        Sort a = new Sort(exp);
        a.print();
        a.selection_sort();
        a.print();


    }
}