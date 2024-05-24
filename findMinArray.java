public class findMinArray {
    public int findMinimum(int [] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        findMinArray findMin = new findMinArray();
        int [] arr = {5,9,3,15,0,2};
        System.out.println(findMin.findMinimum(arr));
    }
}
