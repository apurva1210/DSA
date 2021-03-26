package Algorithm;

public class QuickSelect {

    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect();
        int[] arr = new int[]{1,9,2,8,4,3};
        int n = quickSelect.quickselect(arr, 0, arr.length-1, 5);
        System.out.println("Kth smallest element  = " + n);
    }

    public int quickselect(int[] arr, int l, int r, int k){

        int p = partition(arr, l, r);

        if(p == k-1) return arr[p];

        else if(p > k-1)
            return quickselect(arr, l, p-1, k );
        else
            return quickselect(arr, p+1, r, k);
    }

    public int partition(int[] arr, int l, int r) {

        int pivot = arr[r];
        int i = l-1;

        for (int j = l; j < r; j++) {
            if(arr[j] < pivot)
                swap(arr, ++i, j);
        }

        swap(arr,++i, r);
        return i;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
