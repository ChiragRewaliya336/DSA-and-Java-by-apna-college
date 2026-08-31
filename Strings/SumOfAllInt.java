package Strings;

public class SumOfAllInt {
    public static void main(String[] args) {
        String s ="1234";
        int sum =0;
        for(int i =0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String n = s.substring(i,j);
                sum += Integer.parseInt(n);
            }
        }
        System.out.println(sum);
    }
}
