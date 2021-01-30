public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }
        int a = x % 10;
        int b = y % 10;
        int c = z % 10;
        return ((a == b) || (b == c) || (a == c));
    }
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}