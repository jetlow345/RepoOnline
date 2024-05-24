public class moveZeroes {
    public void moverZeroes(int [] arr, int n){
        
    //Method 1:    
        int j = 0; // focus on zeroth elements
        for(int i = 0 ; i < n; i++){ // focus on non-zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    // Method 2:
    //     int count = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] != 0){
    //             arr[count++] = arr[i];
    //         }
    //     }
    //     while(count < arr.length){
    //         arr[count++] = 0;
    //     }
    // }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        moveZeroes mz = new moveZeroes();
        int[] arr = {8,1,0,2,1,0,3};
        int n = arr.length;
        System.out.println("Original Array: ");
        printArray(arr);
        mz.moverZeroes(arr, n);
        System.out.println("Array after moving zeroes to end: ");
        printArray(arr);
    }
}
