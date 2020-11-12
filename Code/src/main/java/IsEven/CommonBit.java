package IsEven;

public class CommonBit {
    public static int lowestCommon(long x, long y){
        int counter = 0;
        int result = 0;
        while (true) {
            long x1 = x % 2;
            long y1 = x % 2;
            if (x1 == y1) {
                result = counter;
                break;
            } else if (counter == 63) {
                result = -1;
                break;
            }
            x = x / 2;
            y = y / 2;
            counter++;
        }
        return result;
    }
}