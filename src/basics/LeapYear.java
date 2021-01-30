package basics;

public class LeapYear {

    public static boolean isLeapYear(int year){

        if (year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.println("True");
                        return true;
                    }
                    System.out.println("False - not divisible by 400");
                    return false;
                }
                System.out.println("True - not divisible by 100");
                return true;
            }
            System.out.println("False - not divisible by 4");
            return false;
        }
        System.out.println("False - out of range");
        return false;
    }
}