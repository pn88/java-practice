package basics;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = number % 10;
        int first = 0;
        for(int i = number; i > 0; i /= 10) {
            if (i < 10) {
                first = i;
            }
        }
        return (first + last);
    }
}