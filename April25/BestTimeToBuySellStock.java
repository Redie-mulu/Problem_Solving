package April25;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,4,1}));
        System.out.println(maxProfit(new int[]{3,2,6,5,0,3}));
    }
    public static int maxProfit(int[] prices) {
        if (prices == null) return 0;

        int min = prices[0];
        int index = 0;
        int maxDiff = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < min && i != prices.length -1 ){
                min = prices[i];
                index = i;
            }
            if(prices[i+1] - min > 0 && prices[i+1] - min > maxDiff)  maxDiff = prices[i+1] - min;
        }
//        System.out.println(min);
        int max = min;

        for ( int i = index; i < prices.length; i++) {
            if(prices[i] > max) max = prices[i];
        }
        if(maxDiff  > (max - min)) return maxDiff;
        return max - min;
    }
    public static int maxProfit2(int[] prices) {
       int min=prices[0];
       int maxValue=-1;

       for (int i=1;i<prices.length;i++){

           min=Math.min(min,prices[i]);
           maxValue=Math.max(maxValue,prices[i]-min);
       }
       return maxValue;

    }
}
