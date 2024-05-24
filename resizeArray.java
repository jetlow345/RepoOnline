public class resizeArray {
    public int[] resize (int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        resizeArray ra = new resizeArray();
        int[] arr = {5,1,2,9,10};
        int capacity = 10;
        System.out.println("Original Array: ");
        printArray(arr);
        arr = ra.resize(arr, capacity);
        System.out.println("Array after resizing: ");
        printArray(arr);
    }
}
