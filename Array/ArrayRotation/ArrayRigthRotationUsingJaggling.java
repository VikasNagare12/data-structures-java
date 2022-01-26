package Array.ArrayRotation;

public class ArrayRigthRotationUsingJaggling {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int rotation = 3;
        rotateArray(arr, rotation);

    }

    public static void rotateArray(int[] arr, int rotation) {
        int n = arr.length % rotation;
        int gcd = getGCD(n, rotation);
    }

    public static int getGCD(int n, int rotation) {
        if (rotation == 0)
            return n;
        return getGCD(n, n % rotation);
    }
}
