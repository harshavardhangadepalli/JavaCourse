public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = (10 + 6) * 100;
        int b = 100;
        int c = b * a;
        System.out.println("My number "+c+" what is this");
        System.out.println("Maximum number "+Integer.MAX_VALUE);

        // range of byte is 128 to -127 ( since it is signed )
        byte d = 10;
        System.out.println(d);

        // range is 16 bits, so till 2**15
        System.out.println("Short max val" + Short.MAX_VALUE);
        System.out.println("Short min val" + Short.MIN_VALUE);

        // for int it is 32, (31 because signed) to 2**31


        // for long it is 2**63 hehe (64 bits)
        long e = 100L;
        System.out.println("Short max val" + Long.MAX_VALUE);
        System.out.println("Short min val" + Long.MIN_VALUE);
        System.out.println(e);



        // casting
        byte m = (byte)(Integer.MIN_VALUE/2);
        System.out.println(m);

        // floats and doubles
        float f = 3.14159265F;
        double dou = 3.141592651121221D;
        System.out.println(f);
        System.out.println(dou);

        System.out.println("float max val" + Float.MAX_VALUE);
        System.out.println("float min val" + Float.MIN_VALUE);


        System.out.println("double max val" + Double.MAX_VALUE);
        System.out.println("double min val" + Double.MIN_VALUE);


    }
}