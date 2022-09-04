import java.lang.Math;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(95.75));
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long ret = -1;
        if(kilometersPerHour < 0)
            return ret;
        return (long)Math.round(kilometersPerHour * 0.6215);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour+" km/h = "+Math.round(kilometersPerHour * 0.62137119223733)+" mi/h");
    }
}
