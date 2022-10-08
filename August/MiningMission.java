package August;

public class MiningMission {
    public static void main(String[] args) {

        System.out.println(miningMineral(4));
        System.out.println(miningMineral(1));
        System.out.println(miningMineral(9));
        System.out.println(miningMineral(99));
        System.out.println(miningMineral(1000000));

    }
    public static int miningMineral(int n) {
        int number = 1;
        int count = 0;
        // it will be fast if the harvester robot to clone until the number of robot
        // become total amount of mine required in gram
        // since one robot can mine one gram per day
        while (!(number >= n)) {
            number = number*2;
            count++;
        }
        return count+1;
    }
}
