package march17;

public class UglyNumber {
    public static void main(String[] args) {
//        System.out.println(isUgly(20));
//        System.out.println(isUgly(14));
        System.out.println(isUgly(6));
    }
    public static boolean isUgly(int n) {
        if(n < 0) return false;
        int num = n;
        int i = 2;
        while (num > 1)
        {
            if(num% i != 0){
                i++;
            }
            else {
               int result =  num / i;
                System.out.println("i"+i);
                if(isPrime(result) && (result != 3 && result != 2 && result != 5)) {
                    System.out.println("stop");
                    return false;
                }

//                System.out.println(result);
               num = result;
               i = 2;
            }
        }
        return true;
    }
    public static boolean isPrime(int n) {
        if(n == 1 ) return false;
        if(n == 2) return true;
        for (int j = 2; j < n; j++) {
            if(n % j == 0) return false;
        }
        return true;

    }

}
