import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] bubbleSort(int[] arr) {
        boolean swapped = false;

//      loop through the array and swap unsorted consecutive numbers till the array is sorted. In an iteration completes without swapping any number, the loop will terminate
        while (!swapped) {
            boolean swappedValue = false;
            for (int i = 0; i < arr.length; i++) {
                if (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                    swappedValue = true;
                }
            }

            if (!swappedValue) {
                swapped = true;
            }
        }

        return arr;
    }

    static int[] selectionSort(int[] arr) {
//      We will maintain a sorted right side and unsorted left side. We will be in search of a value less that the current index from that index up to the maximum index. After we find it we will swap the values
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        String inputStr;

//      Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers separated by spaces: ");
        inputStr = scanner.nextLine();

        String[] numsStr = inputStr.split(" ");
        int[] nums = new int[numsStr.length];

        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

//        Choose sorting algorithm
        System.out.println("Select sort algorithm: \n 1. Bubble sort \n 2. Selection sort ");

        if (scanner.nextInt() == 1) {
            System.out.println("Sorted arr: " + Arrays.toString(bubbleSort(nums)));
        } else {
            System.out.println("Sorted arr: " + Arrays.toString(selectionSort(nums)));
        }

    }
}