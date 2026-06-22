public class EvenArray {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int cd = 0;
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            int cnt = 0;
            while(n>0){
                int rem = n%10;
                cnt += 1;
                n = n%10;
            }
            if(cnt%2==0){
                cd += 1;
            }
        }

        System.out.println("Even number of digits in an array: "+cd);
    }
    
}
