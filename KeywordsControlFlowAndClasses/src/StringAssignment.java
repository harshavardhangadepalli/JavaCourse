
public class StringAssignment {
    public static void main(String[] args) {
        // String numberAsString = "2018";
        // System.out.println("numberAsString = "+numberAsString);

        // int number = Integer.parseInt(numberAsString);
        // System.out.println("number = "+ number);

        // number += 1;
        // numberAsString += 1;

        // System.out.println("Number as string "+numberAsString);
        // System.out.println("Number as number "+number);

        // System.out.println(canPack(2, 1, 5));

        System.out.println(getLargestPrime(21));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        if (smallCount == goal)
            return true;
        if (bigCount * 5 == goal)
            return true;
        while ( goal-5 >= 0 && bigCount > 0) {
            goal -= 5;
            bigCount -= 1;
        }
        if (smallCount >= goal)
            return true;
        return false;
    }

    public static int getLargestPrime(int number) {
        if (number < 0)
            return -1;
        class Local {
            boolean isPrime(int a) {
                if (a == 0 || a == 1)
                    return false;
                for (int i = 2; i < a; i++) {
                    if(a % i == 0)
                        return false;
                }
                return true;
            }
        }
        if (new Local().isPrime(number))
            return number;
        int ans = -1;
        for (int i = 1; i < number; i++) {
            if(number % i == 0 && new Local().isPrime((i)))
                ans = i;
        }
        return ans;
    }
}
