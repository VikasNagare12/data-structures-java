public class ArrayRightRotationtUsingReverse {

    public static void main(String ar[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int shift = 2;
        print(arr);
        rotateArray(arr, shift);
        print(arr);
    }

    public static void rotateArray(int arr[], int shift) {
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, arr.length - shift, arr.length - 1);
        reverseArray(arr, 0, arr.length - shift - 1);

    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void print(int arr[]) {
        for (int element : arr) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}