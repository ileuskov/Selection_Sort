import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Initializing a scanner

        System.out.println("Welcome to the Selection Sort! Enter a length of an array you want to be sorted: ");
        int limit = s.nextInt(); // Initializing an integer that represent the length of the array. The integer is given by user

        while(limit <= 0){ // Making sure the length is always positive
            System.out.println("Please enter a positive number since it's not possible to sort an empty or a negatively long array: ");
            limit = s.nextInt();
        }
        s.close(); // closing the scanner

        int[] arr = new Random().ints(limit, -100, 100).toArray(); // Creating an array with the user's length. The numbers are randomly generated and are in the range between -100 and 100

        System.out.println("This is how your random generated array looks like: ");
        System.out.print("[ ");
        Sort a = new Sort(arr); // Creating an object of the class sort and passing the our randomly generated array in its constructor
        a.print(); // Calling a print method that prints out every number in the array before it is sorted
        System.out.println("]");

        a.selection_sort(); // Calling a method to sort the array

        System.out.println("And now you see a sorted version of it: ");
        System.out.print("[ ");
        a.print(); // Calling a print method to show how the sorted array look like
        System.out.println("]");
    }
}