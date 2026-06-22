public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {-18, -12, -4, 0, 2, 3,4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = search(nums, target);
        System.out.println("Index of the target: "+ans);

    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return -1;



    }
}
