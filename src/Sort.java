public class Sort {
    int[] arr;

    Sort(int[] arr){ // A constructor for the sort class
        this.arr = arr;
    }
    public void print() { // a method to print out all the elements of an array in the beginning
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void selection_sort() { // A method that sorts all the elements of an array by selecting the smallest number and putting it in the beginning of the array
        for (int i = 0; i + 1 < arr.length; i++) { //First we look for the smallest element by comparing the first element to all the other ones
            int ind = i; // First element has an index that is stored in a separate variable "ind"

            for (int j = ind + 1; j < arr.length; j++) { // this loop checks all the elements after the ind element
                if (arr[j] < arr[ind]) { // if any element is lower than ind element, the ind element
                    ind = j; // the index of the lowest element of all the array is now stored in the "ind" variable
                }
            }
            // Swapping the element that is being checked by the very first loop with the lowest one that was found
            int tmp = arr[i]; // a temporal variable that stores the element of an array that is being checked
            arr[i] = arr[ind]; // now this element has a value of the lowest one that was found
            arr[ind] = tmp; // now the element that had a lowest value, has a value of the element that was checked during this iteration
        }
    }

}
