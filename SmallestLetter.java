public class SmallestLetter {
    public static void main(String[] args){

    }
    
    public char nextgreatestletter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==letters[mid]){
                return letters[mid];
            }
            else if(target>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return letters[start % letters.length];
    }

    
}
