public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int initNum = number;
        while (initNum != 0) {
            int lastDigit = initNum % 10;
            reverse += lastDigit;

            if (reverse == number) {
                return true;
            }

            initNum /= 10;
            reverse *= 10;
        }
        return false;
    }
}