package String_Builder;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Chirag";
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // int i=0;
        // int j= sb.length()-1;
        // while(i<=j){
        // char temp1 =sb.charAt(i);
        // char temp2 =sb.charAt(j);
        // sb.setCharAt(i, temp2);
        // sb.setCharAt(j, temp1);
        // i++;
        // j--;
        // }
        sb.deleteCharAt(0);
        sb.insert(0, 'c');
        System.out.println(sb);
        System.out.println(sb);
    }
}
