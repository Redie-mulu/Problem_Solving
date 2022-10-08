package march17;

public class RandomInt {
    public static void main(String[] args) {

    }
    public static int getRandomInt() {
        return (int) Math.random();
    }
    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper -lower;
        int start = getRandomInt();
        start = Math.abs(start) %(difference + 1);
        start += lower;
        return start;

    }
}
