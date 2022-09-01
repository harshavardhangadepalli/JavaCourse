public class ControlFlow {
    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printNumberInWord(int a){
        switch (a) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
            break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");;
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999)
            return false;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        if (year % 400 == 0)
            return true;
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12)
            return -1;
        if (year < 1 || year > 9999)
            return -1;
        if (month == 2 && isLeapYear(year))
            return 29;
        if (month == 2)
            return 28;
        switch (month) {
            case 1:
                return 31;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static boolean isOdd(int number) {
        if(number < 0)
            return false;
        if (number % 2 == 0)
            return false;
        if (number %2 != 0)
            return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0 || end < 0)
            return -1;
        int s = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i))
                s += i;
        }
        return s;
    }

    public static int sumDigits(int number){
        if (number < 10)
            return -1;
        int s = 0;
        while (number != 0){
            s += number % 10;
            number /= 10;
        }
        return s;
    }

    public static boolean isPalindrome(int number){
        int newNumber = 0, oldNumber = number;
        while(oldNumber != 0) {
            newNumber *= 10;
            newNumber += oldNumber % 10;
            oldNumber /= 10;
        }
        return newNumber == number;
    }

    public static int sumFirstAndLastDigit(int number) {
        int s = 0;
        if (number < 0)
            return -1;
        if(number / 10 == 0)
            return number*2;
        s += number % 10;
        while(number / 10 != 0) {
            number = number / 10;
        }
        s += number;
        return s;

    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if ( a < 10 || b < 10)
            return -1;
        for(int i = Math.min(a,b); i > 0; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return -1;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i+" ");
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int s = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                s += i;
        }
        return (s == number);
    }
}
