package Strings;

public class PrintAllSubstring {
    public static void main(String[] args) {
        String s="Chirag";
        int n = s.length();
        for(int i=0; i<=n; i++){
            System.out.print("String from "+i+":");
            for(int j=i; j<=n; j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
