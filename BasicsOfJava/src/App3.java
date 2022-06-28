public class App3 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s);
        // strings are immuteable, but still this works. Creation of new string and assigning
        s += "ab";
        System.out.println(s);
        // accessing characters at index
        System.out.println(s.charAt(2));

        System.out.println(10/2);
        // you can use +=, -=, /=, and *=
    }
}