public class App2 {
    public static void main(String[] args) throws Exception{
        byte b = 10;
        short s = 100;
        int i = 101;
        long l = 50000L + (10L * (b + s + i));
        System.out.println(l);

        double pound = 100;
        double kg = pound * 0.45359237;
        System.out.println(kg);
    }
}
