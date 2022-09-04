public class CodingExercise1 {
    public static void main(String args[]) throws Exception{
        checkNumber(10);
    }
    public static void checkNumber(int num){
        if(num > 0)
            System.out.println("positive");
        else if(num < 0)
            System.out.println("negative");
        else
            System.out.println("equal to 0");
    }
}
