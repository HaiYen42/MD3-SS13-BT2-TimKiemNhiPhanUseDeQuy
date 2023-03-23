import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int size= input.nextInt();
        int[] array = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Element "+ (i+1) + " is ");
             array[i]= input.nextInt();
        }
        System.out.println("Before " + Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
        Arrays.sort(array);
        System.out.println("After " + Arrays.toString(array));
        System.out.println("Enter the number you want to find in array ");
        int key= input.nextInt();
        int result = new Main().binarySearch(array,0,array.length - 1,key);
        System.out.println("Result--> " + (result == -1 ?"Not found ! ": "Found in array !" ));
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (right>left) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
                return binarySearch(array, left, right, value);
            } else {
                right = middle - 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}