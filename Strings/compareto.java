package Strings;

public class compareto {
    public static int compare(String s1, String s2){
        int ans=0; 
            for(int i=0; i<s1.length(); i++){
                char ch1= s1.charAt(i);
                char ch2= s2.charAt(i);
                if(ch1 != ch2){
                    ans = ch1-ch2;
                    break;
                }
                if(s1.length() != s2.length()){
                    return s1.length()-s2.length();
                }
            }
        return ans;
    }
    public static void main(String[] args) {
        String s1 ="chirag";
        String s2="rewaliya";
        System.out.println(s1.compareTo(s2)); // Compare to function print the differnce between ascii value.
        System.out.println(compare(s1, s2));
        String s3= "Harshit";
        String s4= "Harsh";
        System.out.println(compare(s3, s4));
        System.out.println(s3.compareTo(s4)); //This will print the length of remaining letters.
    }
}
