
public class RichestCustomer {
    public static void main(String[] args) {
        int [][] acc = {{1,2,3}, {3, 4,5}};
        int ans = MaximumWealth(acc);
        System.out.println("Richest wealth: "+ans);
        
    }

    public static int MaximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];

            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
    
}
