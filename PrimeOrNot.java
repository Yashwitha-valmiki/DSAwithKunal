public class PrimeOrNot {
    public static void main(String[] args) {
        // prime(13);
        int n = 20;
        for(int i=1;i<=n;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;

        }
        return true;
    }

    // static void prime(int n){
    //     for(int i=2;i<=n;i++){
    //         if(n%i==0){
    //             System.out.println(i+" is prime");
    //         }
    //     }
    // }
}
