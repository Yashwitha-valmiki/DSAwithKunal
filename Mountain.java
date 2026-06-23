public class Mountain {
    public static void main(String[] args){

    }

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }

        return start;
        
    }

    public int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid+1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else if(target<mid){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    
}
