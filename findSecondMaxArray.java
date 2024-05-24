public class findSecondMaxArray {
    public int findSecondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
}
    public static void main(String[] args) {
        findSecondMaxArray findSecondMax = new findSecondMaxArray();
        int [] arr = {5,9,3,15,0,2};
        System.out.println(findSecondMax.findSecondMax(arr));
    }
}
