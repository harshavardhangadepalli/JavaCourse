public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 10);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        if(barking && (hourOfDay < 8 || hourOfDay > 22))
            return true;
        return false;
    }
}
