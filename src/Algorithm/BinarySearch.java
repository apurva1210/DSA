package Algorithm;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{ 2, 3, 4, 10, 40};

        int x = 10;

        int index = binarySearch(arr, 0, arr.length-1, x);

        if(index == -1) System.out.println("element not found");
        else System.out.println("Element found at index = " + index);

    }

    public static int binarySearch(int[] arr, int l, int r, int x){

        if(r>=l) {

            int mid = (l + r) / 2;

            int midElement = arr[mid];

            if (midElement == x) return mid;

            if (midElement > x) return binarySearch(arr, l, mid-1, x);

            return binarySearch(arr, mid+1, r, x);
        }

        return -1;
    }

}
