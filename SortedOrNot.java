import java.util.ArrayList;
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,78,67,4,4,5,88,4, 45, 89};

        // System.out.println(sorted(arr, 0));
    //     // int n=arr.length-1;
    //     System.out.println(find(arr,88, 0));
    //     System.out.println(findIndex(arr, 88, 0));
    //     System.out.println(findIndexLast(arr, 88,arr.length-1 ));
    //     System.out.println();
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        // findAllIndexs(arr, 4, 0, list);
        // System.out.println(list);
        System.out.println(findAllIndex2(arr, 4, 0));


    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&sorted(arr, index+1);
    }
    static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr, target,index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static int findIndexLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndexLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);

    }
    static ArrayList<Integer> findAllIndexs(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndexs(arr, target, index+1, list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowcalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansfromBelowcalls);
        return list;
    }
}
