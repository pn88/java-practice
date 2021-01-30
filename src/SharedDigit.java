public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int a = x / 10;
        int b = y / 10;
        int c = x % 10;
        int d = y % 10;
        return ((a == b) || (c == d) || (a == d) || (b == c));
    }
}