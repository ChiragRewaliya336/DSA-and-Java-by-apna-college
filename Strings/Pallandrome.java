package Strings;

public class Pallandrome {
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                char chi = Character.toLowerCase(ch);
                sb.append(chi);
            }
        }
        int l=0; int r= sb.length()-1;
        while(l<=r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="Naman";
        System.out.println(check(s));
    }
}
