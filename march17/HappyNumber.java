package march17;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {

        if(n == 0 || (Integer.parseInt(String.valueOf(n)) == 1 && n != 1)) return false;
        int num = n;
        int sum = 0;
        int count = 0;

        while (String.valueOf(num).length() != 1) {
            sum = 0;
            while (num > 0) {
                count++;
                int digit = num % 10;

                sum += digit * digit;

                num = num / 10;
            }
            num = sum;
        }
        return (num == 1);
    }
}
