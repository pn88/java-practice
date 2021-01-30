package basics;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int n = number;
        int n1 = n;
        int count = 0;
        while (n != 0) {
            if ((number % n) == 0) {
                for(n1=n;n1!=0;n1--){
                    if((n % n1) == 0){
                        count++;
                    }
                }
                if(count == 2){
                    return n;
                }
                count-=count;
            }
            n--;
        }
        return -1;
    }
}