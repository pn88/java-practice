package basics;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        for(int sum = 0;number >= 0;number /= 10){
            if(number == 0)
                return sum;
            sum += ((number%10)%2)==0?number%10:0;
        }
        return -1;
    }
}