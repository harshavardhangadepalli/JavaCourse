import java.lang.Math;
public class Overloading {
    public static double area(double radius){
        if(radius < 0)
            return -1;
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0)
            return -1;
        return x * y;
    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long y,d;
        d = minutes / (60*24);
        y = d/365;
        d = d % 365;
        System.out.println(minutes+" min = "+y+" y and "+d+" d");
    }

    public static void printEqual(int a, int b, int c){
        if( a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
            return;
        }
        if(a == b && b == c & c == a){
            System.out.println("All numbers are equal");
            return;
        }
        if(a != b && b != c & c != a){
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
            if(summer && 25 <= temperature && temperature <= 45)
                return true;
            if(!summer && 25 <= temperature && temperature <= 35)
                return true;
            return false;
    }
}
