package Sliding_Window;
public class maximumsubarraysum {
    public static void main(String[] args) {
        int arr[] ={-1,2,3,4,5,-1};
        int k=4;
        int n= arr.length-1;
        int l=0;
        int r=k-1;
        int sum =0;
        int i=0;
        int ms=0;
        while(i<k){
            sum +=arr[i];
            i++;
        }
        while(r<n){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum +arr[r];
            ms = Math.max(ms,sum);
        }
        System.out.println(ms);
    }
}