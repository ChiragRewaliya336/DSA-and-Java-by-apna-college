package Strings;

public class StringImmutable {
    public static void main(String[] args) {
        String s = "Chirag";
        // s.charAt(3) = 'r'; gives error because string is immutable
        // s = s.substring(0,3) + 'r'+s.substring(4);

        System.out.println(s);
        String y = new String("Chirag");
        String x="Chirag";
        System.out.println(s==y); // it will compare the address
        System.out.println(x==s);
        // for comparing two string use this function always
        System.out.println(s.equals(y));
    }
}
