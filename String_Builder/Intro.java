package String_Builder;

public class Intro {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Chirag");
        System.out.println(s.length() +" "+s.capacity());
        System.out.println(s);
        s.append(" rewaliiya");
        System.out.println(s);
        System.out.println(s.length() +" "+s.capacity());
        System.out.println("Empty string capacity");
        StringBuilder y = new StringBuilder();
        System.out.println(y.length() +" "+y.capacity());
        System.out.println("Customize size");
        StringBuilder x = new StringBuilder(10);
    }
}
