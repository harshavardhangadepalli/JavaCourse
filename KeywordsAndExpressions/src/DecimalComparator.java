public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        if(a < 0 && b < 0){
            if(Math.ceil(a * 1000) / 1000 == Math.ceil(b * 1000) / 1000)
                return true;
        }
        if(Math.floor(a * 1000) / 1000 == Math.floor(b * 1000) / 1000)
            return true;
        return false;
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if(a+b == c)
            return true;
        return false;
    }

    public static boolean hasTeen(int a, int b, int c){
        if(13 <= a && a <= 19)
            return true;
        if(13 <= b && b <= 19)
            return true;
        if(13 <= c && c <= 19)
            return true;
        return false;
    }

    public static boolean isTeen(int a){
        if(13 <= a && a <= 19)
            return true;
        return false;
    }
}
