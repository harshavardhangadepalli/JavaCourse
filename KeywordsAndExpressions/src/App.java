public class App {
    public static void main(String[] args) throws Exception {
        // some of the keywords are:
        // all data types
        // access specifiers
        // class, interface, etc
        int a = 10;
        a++;
        a--;
        System.out.println(a);
        System.out.println("This is a " + 
        "line");
        // spaces don't affect code
        // if else tree:
        if(a > 100)
            System.out.println(1);
        else if(a < 100)
            System.out.println(2);
        else
            System.out.println(3);
        

        // declaring like this will delete the variable after if has been executed.
        if(a < 100){
            int b = 100;
            // scope of b is just here
            System.out.println(b);
        }
        // b cannot be accessed here
        // System.out.println(b);
    }
    public static int my_method(int a){
        return a * a;
    }
}
