public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarysearch(arr , 4));

    }
    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k  ){
                return mid;
            }
            else if(arr[mid] > k){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
