import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 9, 5, 6, 7, 8, 3, 4, 2};
        System.out.println("Before " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("After " + Arrays.toString(array));
        System.out.println("Result--> "+new Main().binarySearch(array,0,array.length - 1,5));
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (right>left) {
            if (array[middle] == value) {
                return array[middle];
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